package com.wipro.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.lang.Exception;


public class Test6 {
	
	public static void main(String[] args) throws Exception
	{
		//load driver
		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver loaded");
			
			//get connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
			System.out.println("get connected");
			//create statement
			
			Statement st=con.createStatement();
			System.out.println("statement is printed");
			//procces the query
			st.addBatch("insert into student values(153,'lakshmi',42)");
			st.addBatch("update student set stname='sunilkuncham' where stid=101");
			st.addBatch("delete from student where stid =104");
			
			int x[] = st.executeBatch();
			
			System.out.println(x[0]+ "rows inserted");
			System.out.println(x[1]+ "rows updated");
			
			
			//connection close
			con.close();
			System.out.println("connection is closed");
			
				
		
		
		
	}

}
