package com.wipro.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws Exception {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		
		PreparedStatement ps= con.prepareStatement("insert into student values(?,?,?)");
		
		Scanner s =new Scanner(System.in);
		
		System.out.println("enter the stid");
		int stid=s.nextInt();
		System.out.println("enter the stname");
		String stname=s.next();
		System.out.println("enter the stage");
		int stage=s.nextInt();
		ps.setInt(1,stid);
		ps.setString(2, stname);
		ps.setInt(3, stage);

		int x=ps.executeUpdate();
		System.out.println(x + "row(s) inserted");
		
		con.close();
		
		
	}

}
