package com.wipro.servers;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


	

	public class EmployeeDB {
	    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	    private static final String USER = "system";
	    private static final String PASSWORD = "system";

	    public static Connection getConnection() {
	        Connection connection = null;
	        try {
	            connection = DriverManager.getConnection(URL, USER, PASSWORD);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return connection;
	    }
	}


