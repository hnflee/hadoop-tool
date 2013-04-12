package com.javabloger.hive;
        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.ResultSet;
        import java.sql.Statement;
        public class HiveTestCase {
            public static void main(String[] args) throws  Exception {
                Class.forName("org.apache.hadoop.hive.jdbc.HiveDriver");
                
               String querySQL="SELECT a.* FROM default.et_order a limit 1";
                
                Connection con = DriverManager.getConnection("jdbc:hive://10.72.8.230:11000/et_prd", "","" );
                Statement stmt = con.createStatement();
                ResultSet res = stmt.executeQuery(querySQL);   // 执行查询语句
                while (res.next()) {
                    System.out.println("Result: id:"+res.getString(1) +"  –>  order_no:" +res.getString(2));
                }
            }
        }

