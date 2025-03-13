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

@WebServlet("/Registration")
public class Registration extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("registration.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
	    String password = request.getParameter("password");
	    String firstname = request.getParameter("firstname");
	    String lastname = request.getParameter("lastname");
	    String phoneno = request.getParameter("phoneno");
	    String email = request.getParameter("email");
	    String address = request.getParameter("address");

	     
	    boolean usernameExists = checkIfUsernameExists(username);
	     
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
        if (usernameExists) {
            out.println("<h3 style='color:red;'>Username already exists! Please choose a different username.</h3>");
            out.println("<a href='register.html'>Back to Registration</a>");
        }
        else {
       boolean isRegistered = registerUser(username, password,firstname , lastname, phoneno, email, address);

        if (isRegistered) {
            out.println("<h3 style='color:green;'>Registration Successful!</h3>");
        } else {
            out.println("<h3 style='color:red;'>Registration Failed. Please try again.</h3>");
        }
        out.println("<a href='welcome.jsp'>Login</a>");
    }
      }
	 private boolean checkIfUsernameExists(String username) {
	        boolean exists = false;
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/payment_gateway_system", "root", "Varma@123");
	            String query = "SELECT * FROM user_details WHERE user_name = ?";
	            PreparedStatement ps = con.prepareStatement(query);
	            ps.setString(1, username);

	            ResultSet rs = ps.executeQuery();
	            if (rs.next()) {
	                exists = true; 
	            }

	            rs.close();
	            ps.close();
	            con.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return exists;
	    }

	  private boolean registerUser(String username, String password, String firstname, String lastname,String phoneno,String email,String address ) {
	        boolean isRegistered = false;
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/payment_gateway_system", "root", "Varma@123");

	            String query = "INSERT INTO user_details (user_name, pass_word, first_name, last_name, phone, email, address)"
	            		+ " VALUES (?, ?, ?, ?, ?, ?, ?)";
	            PreparedStatement ps = con.prepareStatement(query);
	            ps.setString(1, username);
	            ps.setString(2, password);
	            ps.setString(3, firstname);
	            ps.setString(4, lastname);
	            ps.setString(5, phoneno);
	            ps.setString(6, email);
	            ps.setString(7, address);

	            int rowsAffected = ps.executeUpdate();
	            if (rowsAffected > 0) {
	                isRegistered = true;
	            }

	            ps.close();
	            con.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return isRegistered;
	}

}
