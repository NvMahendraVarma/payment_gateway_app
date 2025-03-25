<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
    <div class="container">
        <div class="form-container">
            <h2>Send Money</h2>
            <form action="Registration" method="Post">
                <div class="form-group">
                    <label for="amountToSend">Amount to Send:</label>
                    <input type="number" id="amountToSend" name="amountToSend" class="form-control" required>
                </div>
                <div class="form-group">
                    <label for="options">From:</label>
                    <select name="options" id="options" class="form-control">
                        <option value="option1">BA 1</option>
                        <option value="option2">BA 2</option>
                        <option value="option3">WA</option>
                    </select>
                </div>
                <div class="form-group">
                    <label>To:</label>
                    <div class="form-check">
                        <input type="radio" id="bank-radio" name="account-type" value="bank" class="form-check-input" checked>
                        <label for="bank-radio" class="form-check-label">Bank Account</label>
                        <input type="text" id="bank-account" placeholder="Enter bank account number" class="form-control mt-2">
                    </div>
                    <div class="form-check">
                        <input type="radio" id="wallet-radio" name="account-type" value="wallet" class="form-check-input">
                        <label for="wallet-radio" class="form-check-label">Wallet Account</label>
                        <input type="text" id="wallet-account" placeholder="Enter wallet account number" class="form-control mt-2">
                    </div>
                </div>
                <button type="submit" class="btn-primary">Send</button>
            </form>
        </div>
    </div>
</body>
</html>
