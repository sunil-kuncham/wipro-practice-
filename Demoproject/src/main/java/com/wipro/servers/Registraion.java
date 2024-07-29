package com.wipro.servers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registraion
 */
@WebServlet("/Registraionform")
public class Registraion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String x = request.getParameter("id");
		String stname = request.getParameter("name");
		String y=request.getParameter("age");
		
	
		int stid = Integer.parseInt(x);
		int stage = Integer.parseInt(y);
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sytem","system");
			
			
				PreparedStatement ps= con.prepareStatement("insert into student values(?,?,?)");
				ps.setInt(1,stid);
				ps.setString(2,stname);
				ps.setInt(3,stage);
				int result=ps.executeUpdate();
				PrintWriter pw = response.getWriter();
				if(result>0) {
				
				pw.println("<h1>Registration completed</h1>");}
				else {
					pw.println("<h1>Registration not successful</h1>");
				}
	
				
				pw.close();
				
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
