<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DashBoard Page</title>
<link rel="stylesheet" type="text/css" href="styles.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>
	<%@ include file="header.jsp" %>	
	<div id='block'>
		<div id='userSection'>
		    <div>
				<h4>Primary bank Account no</h4>
				<h4>Account balance</h4>
				<h4>Wallet balance</h4>
			</div>
			<div id='sendMoneyButton'>
				<a href="sendMoney.jsp">
					<button class="sendMoney">Send Money</button>
				</a>
			</div>
		</div>
	</div>
	
	<div id='block'>
		<div id='userSection'>
			<table border="">
			    <tr>
					<td>
						BANK NAME:</br>
						BANK Acct No:</br>
						Curr Balance: </br>
						IFSC CODE:</br>
						BRANCH:
					</td>
				</tr>
			</table>
			<div id='sendMoneyButton'>
				<a href="addBankAccount.jsp">
					<button  class="sendMoney">Add BankAccount</button>
				</a>
			</div>
		</div>
	</div>
	
	<div id='block'>
		<div  id='userSection'>
			<div>
				<h4>Recent 10 transactions</h4>
			</div>
			<div id='sendMoneyButton'>
				<a href="statement.jsp">
					<button class="statement">Detailed Statement</button>
				</a>
			</div>
		</div>
	</div>
</body>
</html>





