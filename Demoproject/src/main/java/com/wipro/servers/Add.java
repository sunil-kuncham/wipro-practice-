package com.wipro.servers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Add
 */
@WebServlet("/process")
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fno=request.getParameter("t0");
		String sno=request.getParameter("t1");
		int x=Integer.parseInt(fno);
		int y=Integer.parseInt(sno);
		int z=x+y;
		PrintWriter pw= response.getWriter();
		pw.println("<h1>the sum is:"+z+"</h1>");
		pw.close();
	}

}
