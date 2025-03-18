<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Bank Account Page</title>
<link rel="stylesheet" type="text/css" href="styles.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<%@ include file="header.jsp" %>
	<div id='block'>
		<h2>Add Bank Account</h2>
	</div>
	<div id='block'>
			<form action="Registration" method="Post">	
			<div class="form-group">
	            <label for="bankName">Bank Name :</label>
	            <input type="text" id="bankName" name="bankName" class="form-control">
	        </div>
	        <div class="form-group">
	            <label for="accountNumber">Account Number:</label>
	            <input type="number" id="accountNumber" name="accountNumber" class="form-control">
	        </div>
			<div class="form-group">
	            <label for="accountType">Account Type:</label>
	            <input type="text" id="accountType" name="accountType" class="form-control">
	        </div>
	        <div class="form-group">
	            <label for="ifscCode">IFSC Code:</label>
	            <input type="text" id="ifscCode" name="ifscCode" class="form-control">
	        </div>
	        <div class="form-group">
	            <label for="balance">Current Balance:</label>
	            <input type="number" id="balance" name="balance" class="form-control">
	        </div>
	        <div class="form-group">
	            <label for="pin">Pin:</label>
	            <input type="number" id="pin" name="pin" class="form-control">
	        </div>
			<input type="submit" value="Add" class="btn btn-primary">
		</form>
	</div>

</body>
</html>
