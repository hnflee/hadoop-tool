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
	private static long start_time;
	private static long end_time;

	/**
	 * from datafile get talbe ,after insert data to hive database
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) {


		// TODO Auto-generated method stub
		start_time = System.currentTimeMillis();

		if (args[0] == null) {
			System.out
					.println("ERROR: please add arg0 for properties path  for example:/home/hadoop/properties");
			return;
		}

		try {
			InputStream inputStream = new FileInputStream(args[0].toString());
			if (inputStream.available() == 0) {
				System.out.println("ERROR: properties file length=0 error!");
				inputStream.close();
				return;
			}
			prop.load(inputStream);
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			System.out.println("ERROR: properties file reader error!");
			e2.printStackTrace();
			return;
		}

		if (args[1] == null
				|| ((!args[1].toString().equals("full")) && (!args[1]
						.toString().equals("increment") && (!args[1]
								.toString().equals("drop")&&(!args[1]
										.toString().equals("create")))))) {
			System.out.println("ERROR: arg[1] is " + args[1]);
			System.out
					.println("ERROR: arg[1] is unll or not in { 'full','increment' }");
			return;
		}
		String type = args[1].toString();
		File file = null;
		if (type.equals("full")||type.equals("drop")||type.equals("create")) {
			file = new File(prop.getProperty("datafile"));
		} else if (type.equals("increment")) {

			file = new File(prop.getProperty("incrementfile"));
		} 
		

		BufferedReader reader = null;
		try {

			reader = new BufferedReader(new FileReader(file));
			String tempString = null;
			while ((tempString = reader.readLine()) != null) {
				if (tempString == null || tempString.trim().equals(""))
					continue;
				if (type.equals("full")) {
					firestSqoopInput(tempString);//
				} else if (type.equals("increment")) {
					incrementSqoopInput(tempString);
				}else if(type.equals("drop"))
				{
					createDropHql(tempString);
				}
				else if(type.equals("create"))
				{
					createCreateHql(tempString);
				}

				// System.out.print("drop table ET_UAT."+tempString+";");

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
		end_time = System.currentTimeMillis();

		System.out.print("all operation times(mins):"
				+ ((end_time - start_time) / (1000 * 60)));

	}

	private static void createCreateHql(String tempString) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		ResultSet result = null;

		StringBuffer mapclume = new StringBuffer();
		String tmp = "";
		// --map-column-hive ID=BIGINT
		mapclume.append("create table "+prop.getProperty("hive_db").toUpperCase()+"."+tempString.toUpperCase()+"_P (");

		for (int j = 0; j < 5; j++) {

			try {
				tempString = tempString.toUpperCase();
				
				Class.forName(prop.getProperty("drive"));
				conn = DriverManager.getConnection(prop.getProperty("url"),
						prop.getProperty("dbuser"),
						prop.getProperty("password")); //
				stmt = conn.createStatement();
				// get table scheme from oracle
				result = stmt
						.executeQuery(" SELECT t.COLUMN_NAME,t.DATA_TYPE,t.DATA_LENGTH,t.DATA_SCALE  FROM "
								+ prop.getProperty("all_tab_columns_view")
								+ " t WHERE table_name = '"
								+ tempString.toUpperCase() + "'");
				while (result.next()) {//

					String COLUMN_NAME = result.getString(1);
					String DATA_TYPE = result.getString(2);

					int DATA_LENGTH = 0;
					int UNITID = 0;
					if (DATA_TYPE.equalsIgnoreCase("NUMBER")) {
						DATA_LENGTH = result.getInt(3);
						UNITID = result.getInt(4);
						if (UNITID > 0) {
							mapclume.append(COLUMN_NAME + "  DOUBLE,");
						} else {
							mapclume.append(COLUMN_NAME + "  BIGINT,");
						}
					}
					else
					{
						mapclume.append(COLUMN_NAME + "  STRING,");
						
					}

				

				}
				
				tmp = mapclume.toString();
				tmp = tmp.substring(0, tmp.length() - 1);
				

				result.close();
				stmt.close();
				conn.close();

				Statement stmt1 = null;
				ResultSet result1 = null;

				// search table is or not contain PK

				Connection conn1 = null;
				conn1 = DriverManager.getConnection(prop.getProperty("url"),
						prop.getProperty("dbuser"),
						prop.getProperty("password"));

				stmt1 = conn1.createStatement();

				try {
					result1 = stmt1
							.executeQuery(" SELECT  t1.CONSTRAINT_NAME  FROM "
									+ prop.getProperty("all_cons_columns_view")
									+ " t1 WHERE table_name = '" + tempString
									+ "' and  CONSTRAINT_NAME like '%PK_%'");
				} catch (Exception e) {
					System.out
							.println("WARNING: search table for  contain primary_key  is error");

				}

				result1.close();
				stmt1.close();
				conn1.close();


				String cmd =tmp + " ) PARTITIONED BY(dt STRING); " ;

				System.out.println("");
				System.out.println(cmd);
				System.out.println("");
				break;
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	private static void createDropHql(String tempString) {
		// TODO Auto-generated method stub
		String HIVE_DB = prop.getProperty("hive_db").toUpperCase();
		System.out.println("drop table "+HIVE_DB+"."+tempString+";");
	}

	private static void incrementSqoopInput(String tempString) {
		// tempString exmaple:RT_ET_SALES_REPORT cre_date

		String[] tempStrings;
		if (tempString == null) {
			System.out.println("ERROR: data_increment is null");
			return;
		}
		tempStrings = tempString.split(" ");

		if (tempStrings.length < 2) {
			System.out
					.println("ERROR: data_increment format is error  example: table colume  "
							+ tempStrings.length);
			return;
		}
		tempStrings[0] = tempStrings[0].toUpperCase();

		String values = "";
		// select max(t.cre_date) from et_prd.rt_et_sales_report t where
		// t.cre_date <> "null"
		// get colume news value
		try {
			Class.forName("org.apache.hadoop.hive.jdbc.HiveDriver");
			String querySQL_hive = "select max(t." + tempStrings[1] + ") from "
					+ prop.getProperty("hive_db") + "." + tempStrings[0]
					+ " t where t." + tempStrings[1] + " <> \"null\"";
			Connection con_hive = DriverManager.getConnection(
					prop.getProperty("hive_url"), "", "");
			Statement stmt_hive = con_hive.createStatement();
			ResultSet res = stmt_hive.executeQuery(querySQL_hive); // 执行查询语句
			while (res.next()) {
				values = res.getString(1);
			}
			if (values == null || values.equals("")) {
				System.out.println("ERROR: max_increment_value "
						+ tempStrings[1] + " is null");
				return;
			}
			System.out.println("get  max_increment_value " + tempStrings[1]
					+ " is ok :" + values);

		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
			return;
		}

		// reset time for sum(oracle time)
		start_time = System.currentTimeMillis();

		Connection conn = null;
		Statement stmt = null;
		ResultSet result = null;

		StringBuffer mapclume = new StringBuffer();
		String tmp = "";
		// --map-column-hive ID=BIGINT
		mapclume.append("--map-column-hive ");

		for (int j = 0; j < 5; j++) {

			try {
				System.out.println("begin table " + tempStrings[0]
						+ " insert !");

				Class.forName(prop.getProperty("drive"));
				conn = DriverManager.getConnection(prop.getProperty("url"),
						prop.getProperty("dbuser"),
						prop.getProperty("password")); //
				stmt = conn.createStatement();
				// get table scheme from oracle
				result = stmt
						.executeQuery(" SELECT t.COLUMN_NAME,t.DATA_TYPE,t.DATA_LENGTH,t.DATA_SCALE  FROM "
								+ prop.getProperty("all_tab_columns_view")
								+ " t WHERE table_name = '"
								+ tempStrings[0]
								+ "'");
				while (result.next()) {//

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

				if (tmp.equals("--map-column-hive")) {
					tmp = " ";
				}

				result.close();
				stmt.close();
				conn.close();

				Statement stmt1 = null;
				ResultSet result1 = null;

				// search table is or not contain PK

				Connection conn1 = null;
				conn1 = DriverManager.getConnection(prop.getProperty("url"),
						prop.getProperty("dbuser"),
						prop.getProperty("password"));

				stmt1 = conn1.createStatement();

				try {
					result1 = stmt1
							.executeQuery(" SELECT  t1.CONSTRAINT_NAME  FROM "
									+ prop.getProperty("all_cons_columns_view")
									+ " t1 WHERE table_name = '"
									+ tempStrings[0]
									+ "' and  CONSTRAINT_NAME like '%PK_%'");
				} catch (Exception e) {
					System.out
							.println("WARNING: search table for  contain primary_key  is error");

				}

				if (result1 == null || result1.next() == false) {
					System.out
							.println("WARNING: table is not contain primary_key");

					tmp = tmp + " -m 1 ";
				}

				result1.close();
				stmt1.close();
				conn1.close();

				/**
				 * get colume mostest new values
				 */

				String CONNECTURL = prop.getProperty("url");
				String ORACLENAME = prop.getProperty("dbuser");
				String ORACLEPASSWORD = prop.getProperty("password");
				String HIVE_DB = prop.getProperty("hive_db").toUpperCase();
				String ORACLE_DB = prop.getProperty("oracle_db").toUpperCase();
				String cmd = "sqoop import --connect " + CONNECTURL
						+ " --username " + ORACLENAME + " --password "
						+ ORACLEPASSWORD + " --hive-import --append --table "
						+ ORACLE_DB.toUpperCase() + "."
						+ tempStrings[0].toUpperCase() + " --hive-table "
						+ HIVE_DB.toUpperCase() + "."
						+ tempStrings[0].toUpperCase() + " --check-column "
						+ tempStrings[1]
						+ " --incremental append  --last-value '" + values
						+ "' " + tmp;

				int sqoop_status = 1;

				for (int i = 0; i < 5; i++) {
					try {

						if (i != 0) {
							System.out.println("ERROR:sqoop renew time: " + i
									+ ". ");
						}

						System.out.println("begin sqoop insert: "
								+ tempStrings[0]);
						System.out.println("l :" + cmd);
						Process ee = Runtime.getRuntime().exec(cmd);
						ee.waitFor();

						System.out.println("CMD statuts: " + ee.exitValue());

						if (ee.exitValue() != 0) {
							System.out.println("ERROR:sqoop final status : "
									+ ee.exitValue());
						} else {
							System.out.println("sqoop insert is OK.");
							sqoop_status = 0;
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

				if (sqoop_status == 0) {
					System.out.println("table " + tempStrings[0]
							+ "  insert Normal ");
				} else {
					System.out.println("ERROR: table [" + tempStrings[0]
							+ " ] insert hive error ");
				}

				break;

			} catch (Exception e) {
				System.out.println("ERROR: table " + tempStrings[0]
						+ " reconnect: " + j + " times");
				e.printStackTrace();
				try {
					conn.close();
					result.close();
					stmt.close();

					System.out.println("table " + tempStrings[0]
							+ " connect close normal ! ");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

		}
	}

	private static void firestSqoopInput(String tempString) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet result = null;

		StringBuffer mapclume = new StringBuffer();
		String tmp = "";
		// --map-column-hive ID=BIGINT
		mapclume.append("--map-column-hive ");

		for (int j = 0; j < 5; j++) {

			try {
				tempString = tempString.toUpperCase();
				System.out.println("begin table " + tempString + " insert !");

				Class.forName(prop.getProperty("drive"));
				conn = DriverManager.getConnection(prop.getProperty("url"),
						prop.getProperty("dbuser"),
						prop.getProperty("password")); //
				stmt = conn.createStatement();
				// get table scheme from oracle
				result = stmt
						.executeQuery(" SELECT t.COLUMN_NAME,t.DATA_TYPE,t.DATA_LENGTH,t.DATA_SCALE  FROM "
								+ prop.getProperty("all_tab_columns_view")
								+ " t WHERE table_name = '"
								+ tempString.toUpperCase() + "'");
				while (result.next()) {//

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

				if (tmp.equals("--map-column-hive")) {
					tmp = " ";
				}

				result.close();
				stmt.close();
				conn.close();

				Statement stmt1 = null;
				ResultSet result1 = null;

				// search table is or not contain PK

				Connection conn1 = null;
				conn1 = DriverManager.getConnection(prop.getProperty("url"),
						prop.getProperty("dbuser"),
						prop.getProperty("password"));

				stmt1 = conn1.createStatement();

				try {
					result1 = stmt1
							.executeQuery(" SELECT  t1.CONSTRAINT_NAME  FROM "
									+ prop.getProperty("all_cons_columns_view")
									+ " t1 WHERE table_name = '" + tempString
									+ "' and  CONSTRAINT_NAME like '%PK_%'");
				} catch (Exception e) {
					System.out
							.println("WARNING: search table for  contain primary_key  is error");

				}

				if (result1 == null || result1.next() == false) {
					System.out
							.println("WARNING: table is not contain primary_key");

					tmp = tmp + " -m 1 ";
				}

				result1.close();
				stmt1.close();
				conn1.close();

				String CONNECTURL = prop.getProperty("url");
				String ORACLENAME = prop.getProperty("dbuser");
				String ORACLEPASSWORD = prop.getProperty("password");
				String HIVE_DB = prop.getProperty("hive_db").toUpperCase();
				String ORACLE_DB = prop.getProperty("oracle_db").toUpperCase();
				String cmd = "sqoop import --connect " + CONNECTURL
						+ " --username " + ORACLENAME + " --password "
						+ ORACLEPASSWORD
						+ " --hive-import --hive-overwrite --append --table "
						+ ORACLE_DB.toUpperCase() + "."
						+ tempString.toUpperCase() + " --hive-table "
						+ HIVE_DB.toUpperCase() + "."
						+ tempString.toUpperCase() + " " + tmp;

				int sqoop_status = 1;

				for (int i = 0; i < 5; i++) {
					try {

						if (i != 0) {
							System.out.println("ERROR:sqoop renew time: " + i
									+ ". ");
						}

						System.out.println("begin sqoop insert: " + tempString);
						System.out.println("l :" + cmd);
						Process ee = Runtime.getRuntime().exec(cmd);
						ee.waitFor();

						System.out.println("CMD statuts: " + ee.exitValue());

						if (ee.exitValue() != 0) {
							System.out.println("ERROR:sqoop final status : "
									+ ee.exitValue());
						} else {
							System.out.println("sqoop insert is OK.");
							sqoop_status = 0;
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

				if (sqoop_status == 0) {
					System.out.println("table " + tempString
							+ "  insert Normal ");
				} else {
					System.out.println("ERROR: table [" + tempString
							+ " ] insert hive error ");
				}

				break;

			} catch (Exception e) {
				System.out.println("ERROR: table " + tempString
						+ " reconnect: " + j + " times");
				e.printStackTrace();
				try {
					conn.close();
					result.close();
					stmt.close();

					System.out.println("table " + tempString
							+ " connect close normal ! ");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

		}

	}

}
