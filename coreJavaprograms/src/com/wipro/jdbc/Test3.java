package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test3 {
public static void main(String[] args) throws Exception {
	
	
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
    
	Statement st=con.createStatement();
	
			
	ResultSet rs=st.executeQuery("select * from student");
	
	while (rs.next())
	{
		System.out.println(rs.getInt(1)+","+rs.getString(2)+","+rs.getInt(3));
		
	}
	con.close();
}
}
