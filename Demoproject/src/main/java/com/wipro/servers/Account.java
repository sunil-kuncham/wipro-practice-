package com.wipro.servers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProcessServlet
 */
@WebServlet("/AccounytBalance")
public class Account extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String x = request.getParameter("t1");

		// converting account number from string type to integer type
		int accountNumber = Integer.parseInt(x);
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
			PreparedStatement ps = con.prepareStatement("select balance from sunil where accountno=?");

			ps.setInt(1, accountNumber);

			ResultSet rs = ps.executeQuery();
			PrintWriter pw = response.getWriter();
			if (rs.next()) {
				
				pw.println("<h1>");
				pw.println("the available balance is " + rs.getInt(1));
				pw.println("</h1>");
				pw.println("<a href='index.html'>click </a>");
			}
			else
			{
				pw.println("<h1>something went wrong, kindly check your account number</h1>");
				pw.println("<a href='index.html'>click </a>");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
	
