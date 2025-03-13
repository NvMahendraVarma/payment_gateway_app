package com.paymentwebapp.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/Welcome")
public class Welcome extends HttpServlet {     

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("welcome.jsp");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		

		boolean isValidUser = authenticateUser(username, password);
		
		if (isValidUser) {
	        response.sendRedirect("dashBoard.jsp");
		}
		else {
			out.println("<h3 style='color:red;'>Invalid Username or Password </h3>");
			out.println("<a href='welcomePage.jsp'> Try Again</a>");
		}
		
	}


	private boolean authenticateUser(String username, String password) {
		boolean isValid = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.
					getConnection("jdbc:mysql://localhost:3306/payment_gateway_system","root","Varma@123");
			
			String query = "SELECT * FROM user_details WHERE user_name=? AND pass_word=? ";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				isValid = true;
				System.out.println("isValid is true");
			}
			else {
				System.out.println("isValid is false");
			}
			rs.close();
			ps.close();
			con.close(); 
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("err");
		}
		return isValid;
	}

}
