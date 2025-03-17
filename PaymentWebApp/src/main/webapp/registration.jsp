<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
<link rel="stylesheet" type="text/css" href="styles.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div id='header'>
	<h1>Payment Application</h1>
	</div>
	<div id='form'>
	    <h2>Registration Form</h2><br>
		<form action="Registration" method="Post">	
			<div class="form-group">
	            <label for="username">User Name :</label>
	            <input type="text" id="username" name="username" class="form-control">
	        </div>
	        <div class="form-group">
	            <label for="password">Password:</label>
	            <input type="password" id="password" name="password" class="form-control">
	        </div>
			<div class="form-group">
	            <label for="firstname">First Name:</label>
	            <input type="text" id="firstname" name="firstname" class="form-control">
	        </div>
	        <div class="form-group">
	            <label for="lastname">Last Name:</label>
	            <input type="text" id="lastname" name="lastname" class="form-control">
	        </div>
	        <div class="form-group">
	            <label for="phoneno">Phone No:</label>
	            <input type="tel" id="phoneno" name="phoneno" class="form-control">
	        </div>
	        <div class="form-group">
	            <label for="email">email:</label>
	            <input type="email" id="email" name="email" class="form-control">
	        </div>
	        <div class="form-group">
	            <label for="address">Address:</label>
	            <input type="address" id="address" name="address" class="form-control">
	        </div>
			<input type="submit" value="Register" class="btn btn-primary">
		</form>
	</div>
				
</body>
</html>
