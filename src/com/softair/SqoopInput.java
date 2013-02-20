package com.softair;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class SqoopInput {

	private static Properties prop = new Properties();

	/**
	 * from datafile get talbe ,after insert data   to hive database
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		// TODO Auto-generated method stub
		long start_time=System.currentTimeMillis();

		if(args[0]==null)
		{
			System.out.println("ERROR: please add arg0 for properties path  for:/home/hadoop/properties");
			return;
		}
		
		
		InputStream inputStream = new FileInputStream(args[0].toString());
		
		try {
			if(inputStream.available()==0)
			{
				System.out.println("ERROR: properties file length=0 error!");
				inputStream.close();
				return;
			}
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			System.out.println("ERROR: properties file reader error!");
			e2.printStackTrace();
			return;
		}
			
		

		try {
			prop.load(inputStream);
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		File file = new File(prop.getProperty("datafile"));
		BufferedReader reader = null;
		try {

			reader = new BufferedReader(new FileReader(file));
			String tempString = null;
			while ((tempString = reader.readLine()) != null) {
				if (tempString == null || tempString.trim().equals(""))
					continue;
				printSqoopInput(tempString);//
				//System.out.print("drop table ET_UAT."+tempString+";");

			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
				}
			}
		}
		long end_time=System.currentTimeMillis();
		
		System.out.print("all operation times(H):"+((end_time-start_time)/(1000*60*60)));

	}

	private static void printSqoopInput(String tempString) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet result = null;

		StringBuffer mapclume = new StringBuffer();
		String tmp = "";
		// --map-column-hive ID=BIGINT
		mapclume.append("--map-column-hive ");

		
		for(int j=0;j<5;j++)
		{
		
		
			try {
				System.out.println("begin table "+tempString+" insert !");
				
				Class.forName(prop.getProperty("drive"));
				conn = DriverManager.getConnection(prop.getProperty("url"),
						prop.getProperty("dbuser"), prop.getProperty("password")); // ������ݿ�
				stmt = conn.createStatement();
				// get table scheme from oracle
				result = stmt
						.executeQuery(" SELECT t.COLUMN_NAME,t.DATA_TYPE,t.DATA_LENGTH,t.DATA_SCALE  FROM all_tab_columns t WHERE table_name = '"
								+ tempString + "'");
				while (result.next()) {// �ж���û����һ��
	
					String COLUMN_NAME = result.getString(1);
					String DATA_TYPE = result.getString(2);
	
					int DATA_LENGTH = 0;
					int UNITID = 0;
					if (DATA_TYPE.equalsIgnoreCase("NUMBER")) {
						DATA_LENGTH = result.getInt(3);
						UNITID = result.getInt(4);
	
	
						if (UNITID > 0) {
							mapclume.append(COLUMN_NAME + "=DOUBLE,");
						} else {
							mapclume.append(COLUMN_NAME + "=BIGINT,");
						}
	
					}
	
					tmp = mapclume.toString();
					
					tmp = tmp.substring(0, tmp.length() - 1);
					
	
				}
				
				
				if(tmp.equals("--map-column-hive"))
				{
					tmp=" ";
				}
				
	
				result.close();
				stmt.close();
				conn.close();
				
				
				Statement stmt1 = null;
				ResultSet result1 = null;
				
				//search table is or not contain PK 
				
				Connection conn1 = null;
				conn1 = DriverManager.getConnection(prop.getProperty("url"),
						prop.getProperty("dbuser"), prop.getProperty("password")); 
				
				
				stmt1 = conn1.createStatement();
				
				try
				{
				result1 = stmt1
						.executeQuery(" SELECT  t1.CONSTRAINT_NAME  FROM all_cons_columns t1 WHERE table_name = '"+tempString+"' and  CONSTRAINT_NAME like '%PK_%'");
				}catch(Exception e)
				{
					System.out.println("WARNING: search table for  contain primary_key  is error");
					
				}
				
				if(result1==null||result1.next()==false)
				{
					System.out.println("WARNING: table is not contain primary_key");
					
					tmp=tmp+" -m 1 ";
				}
				
				result1.close();
				stmt1.close();
				conn1.close();
				
				String CONNECTURL = prop.getProperty("url");
				String ORACLENAME = prop.getProperty("dbuser");
				String ORACLEPASSWORD = prop.getProperty("password");
				String HIVE_DB = prop.getProperty("hive_db");
				String ORACLE_DB = prop.getProperty("oracle_db");
				String cmd = "sqoop import --connect " + CONNECTURL + " --username "
						+ ORACLENAME + " --password " + ORACLEPASSWORD
						+ " --hive-import --hive-overwrite --append --table "
						+ ORACLE_DB + "." + tempString + " --hive-table " + HIVE_DB
						+ "." + tempString + " " + tmp;
				
				
				int sqoop_status=1;
	
				
				for (int i = 0; i < 5; i++) {
					try {
	
						if(i!=0)
						{
							System.out.println("ERROR:sqoop renew time: "+i+" ��");	
						}
						
						System.out.println("begin sqoop insert: " + tempString);
						System.out.println("CMD :"+cmd);
						Process ee = Runtime.getRuntime().exec(cmd);
						ee.waitFor();
						
						System.out.println("CMD statuts�� "+ee.exitValue());
						
						if(ee.exitValue()!=0)
						{
							System.out.println("ERROR:sqoop final status : "+ee.exitValue());
						}
						else
						{
							System.out.println("sqoop insert is OK.");
							sqoop_status=0;
							break;
						}
						
						
						
	
					} catch (Exception e) {
						System.out.println("ERROR: sqoop input error !");
						
						try {
						
						conn.close();
						conn1.close();
						System.out.println(" conn close normal !");
						
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						
						
					}
				}
				
				if(sqoop_status==0){
					System.out.println("table "+tempString+"  insert Normal ");
				}
				else
				{
					System.out.println("ERROR: table ["+tempString+" ] insert hive error ");	
				}
				
				break;
	
			} catch (Exception e) {
				System.out.println("ERROR: table "+tempString+" reconnect: "+j+" times��");	
				
				try {
					conn.close(); 
					result.close();
					stmt.close();
					
					System.out.println("table "+tempString+" connect close normal ! ");	
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
			
			}
			
		}

	}
	
}
