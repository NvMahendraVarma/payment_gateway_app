<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Page</title>
</head>
<body>
	<h1 align="center">Welcome to Payment App</h1>
    <h2>Login Form</h2>
    <form method="post" action="Welcome">
        Username: <input type="text" name="username"><br>
        Password: <input type="password" name="password"><br>
        <input type="submit" value="Login">
    </form>
    <p>new user ? <a href='registration.jsp'>Register here</a> </p>
</body>
</html>