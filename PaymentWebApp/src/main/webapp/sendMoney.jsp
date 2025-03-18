<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Send Money Page</title>
<link rel="stylesheet" type="text/css" href="styles.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<%@ include file="header.jsp" %>
	<div id='block'>
		<h2>Send Money</h2>
	</div>
	<div id='block'>
		<div >
			<form action="Registration" method="Post">	
				<div class="form-group">
		            <label for="amountToSend">Amount to Send :</label>
		            <input type="number" id="amountToSend" name="amountToSend" class="form-control">
		        </div>
		        <div class="form-group">
		            <label for="options">From:</label>
		            <select name="options" id="options">
	            		<option value="option1">BA 1</option>
	            		<option value="option2">BA 2</option>
	            		<option value="option3">WA</option>
	            		
	<%--    		            <% --%>
	// 		                // Example list of options
	// 		                List<String> options = Arrays.asList("Option 1", "Option 2", "Option 3");
			
	// 		                // Loop through the list and create options
	// 		                for (String option : options) {
	<%-- 		            %> --%>
	<%-- 	                    <option value="<%= option %>"><%= option %></option> --%>
	<%-- 		            <% --%>
	// 		                }
	<%-- 		            %> --%>
	            
	            
	        		</select>
		        </div>
		        
		        <div class="field-group">
	            	<label>
	            		<input type="radio" id="bank-radio" name="account-type" value="bank" checked>
	                    <span>To Bank Account</span>
	                    <input type="text" id="bank-account" placeholder="Enter bank account number" class="form-control">
	            	</label>
		        </div>
		        
		        <div class="field-group">
		            <label>
		            	<input type="radio" id="wallet-radio" name="account-type" value="wallet">
	                    <span>To Wallet Account</span>
	                    <input type="text" id="wallet-account" placeholder="Enter wallet account number" class="form-control">
		            </label>
		        </div>
	   			<input type="submit" value="Send" class="btn btn-primary">
			</form>
		</div>
	</div>
</body>
</html>
