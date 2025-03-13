<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
</head>
<body>
	<form action="Registration" method="Post">
		<label>Username:</label>
		<input type="text" name="username" required><br><br>
		
		<label>Password:</label>
		<input type="password" name="password" required> <br><br>
		
		<label>First Name:</label>
		<input type="text" name="firstname" required> <br><br>
		
		<label>Last Name:</label>
		<input type="text" name="lastname" required> <br><br>
		
		<label>Phone No:</label>
		<input type="tel" name="phoneno" required> <br><br>
		
		<label>email:</label>
		<input type="email" name="email" required> <br><br>
		
		<label>Address:</label>
		<input type="address" name="address" required> <br><br>
		
		<input type="submit" value="Register">
	</form>
				
</body>
</html>