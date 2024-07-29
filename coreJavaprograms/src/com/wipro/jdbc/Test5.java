package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test5 {
	public static void main(String[] args) throws Exception{
	
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
		con.setAutoCommit(false);
	Statement st=	con.createStatement();
	
	st.addBatch("update sunil set balance=balance-5000 where accountno=1100");
	st.addBatch("update pavan set balance=balance+5000 where accountno=1200");
	int x[]=st.executeBatch();
	
	if(x[0]>0 & x[1]>0) 
	{
		
		con.commit();
		System.out.println("Transaction is successfull");
	}
	else
	{
		con.rollback();
		System.out.println("please check account no");
	}
	con.close();
	System.out.println("connection is closed");
		 	}

}
