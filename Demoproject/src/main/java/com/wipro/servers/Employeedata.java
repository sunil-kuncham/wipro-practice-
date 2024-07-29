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

@WebServlet("/EmployeeManagement")
public class Employeedata extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String empIdStr = request.getParameter("t1");
        String empName = request.getParameter("t2");
        String operation = request.getParameter("operation");

        int empId = Integer.parseInt(empIdStr);

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "system");
            PreparedStatement ps = null;
            ResultSet rs = null;

            switch (operation) {
                case "Insert":
                    ps = con.prepareStatement("INSERT INTO Employee (empId, empName) VALUES (?, ?)");
                    ps.setInt(1, empId);
                    ps.setString(2, empName);
                    ps.executeUpdate();
                    response.getWriter().println("Employee inserted successfully.");
                    
                    break;

                case "Update":
                    ps = con.prepareStatement("UPDATE Employee SET empName=? WHERE empId=?");
                    ps.setString(1, empName);
                    ps.setInt(2, empId);
                    ps.executeUpdate();
                    response.getWriter().println("Employee updated successfully.");
                    break;

                case "Read":
                    ps = con.prepareStatement("SELECT * FROM Employee WHERE empId=?");
                    ps.setInt(1, empId);
                    rs = ps.executeQuery();
                    PrintWriter out = response.getWriter();
                    while (rs.next()) {
                        out.println("Employee ID: " + rs.getInt("empId"));
                        out.println("Employee Name: " + rs.getString("empName"));
                    }
                    break;

                case "Delete":
                    ps = con.prepareStatement("DELETE FROM Employee WHERE empId=?");
                    ps.setInt(1, empId);
                    ps.executeUpdate();
                    response.getWriter().println("Employee deleted successfully.");
                    break;

                default:
                    response.getWriter().println("Invalid operation.");
                    break;
            }
            response.getWriter().println("<a href='index4.html'>click </a>");
          

            if (rs != null) rs.close();
            if (ps != null) ps.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("Error: " + e.getMessage());
            
        }
    }
}