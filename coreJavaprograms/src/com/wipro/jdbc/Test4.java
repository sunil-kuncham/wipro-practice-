package com.wipro.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Test4 {
	public static void main(String[] args) throws Exception {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		
     Statement st=con.createStatement();
      
     ResultSet rs=st.executeQuery("select *from student");
     
     ResultSetMetaData rsmd=rs.getMetaData();
     
     System.out.println("no.of.columns"+rsmd.getColumnCount());
     for(int i=1;i<=rsmd.getColumnCount();i++) {
    	 
    	 System.out.println(rsmd.getColumnName(i)+" "+rsmd.getColumnTypeName(i)+" "+rsmd.getPrecision(i));
     }
     
     
	}

}
