package com.paymentwebapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.paymentwebapp.dto.User;

public class UserDAO {
	
	public boolean authenticateUser(User user) {
		boolean isValid = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.
					getConnection("jdbc:mysql://localhost:3306/payment_gateway_system","root","Varma@123");
			
			String query = "SELECT * FROM user_details WHERE user_name=? AND pass_word=? ";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getPassword());
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
