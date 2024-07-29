package com.wipro.servers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Studentdetails
 */
@WebServlet("/details")
public class Studentdetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String name= request.getParameter("stname");
		 String email= request.getParameter("stemail");
		// @SuppressWarnings("unused")
		//String phno= request.getParameter("stno");
		 String password= request.getParameter("stpassword");
		// int x=Integer.parseInt("phno");
		 PrintWriter pw = response.getWriter();
			
			pw.println("<h1>Students Details are:"+name+"  "+email+"  "+password+"</h1>");
			pw.close();
		 
		
	}

}
