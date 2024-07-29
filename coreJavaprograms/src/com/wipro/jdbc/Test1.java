package com.wipro.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Test1 {
	
	public static void main(String[] args)
	{
		//load driver
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver loaded");
			
			//get connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
			System.out.println("get connected");
			//create statement
			
			Statement st=con.createStatement();
			System.out.println("statement is printed");
			//procces the query
			int x =st.executeUpdate("delete from student where stname='anusha'");
			
			System.out.println(x+ "rows deleted");
int y =st.executeUpdate("insert into student values(106,'ram')");
			
			System.out.println(y+ "rows inserted");
int z =st.executeUpdate("update  student set stname='ram' where stid=106");
			
			System.out.println(z+ "rows updated");
			
			
			//connection close
			con.close();
			System.out.println("connection is closed");
			
		} 
		
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		
		
	}

}
