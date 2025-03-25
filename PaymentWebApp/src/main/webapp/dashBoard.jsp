<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard Page</title>
<link rel="stylesheet" type="text/css" href="styles.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
    <%@ include file="header.jsp" %> 
    <div class="container">
        <div class="form-container">
            <h2>Account Overview</h2>
            <div class="form-group">
                <label>Primary Bank Account No:</label>
                <p>1234567890</p>
            </div>
            <div class="form-group">
                <label>Account Balance:</label>
                <p>$10,000</p>
            </div>
            <div class="form-group">
                <label>Wallet Balance:</label>
                <p>$500</p>
            </div>
            <button class="btn-primary" onclick="window.location.href='sendMoney.jsp'">Send Money</button>
        </div>

        <div class="form-container">
            <h2>Bank Account Details</h2>
            <div class="form-group">
                <label>Bank Name:</label>
                <p>Example Bank</p>
            </div>
            <div class="form-group">
                <label>Account Number:</label>
                <p>1234567890</p>
            </div>
            <div class="form-group">
                <label>Current Balance:</label>
                <p>$10,000</p>
            </div>
            <div class="form-group">
                <label>IFSC Code:</label>
                <p>EXMP123456</p>
            </div>
            <div class="form-group">
                <label>Branch:</label>
                <p>Main Branch</p>
            </div>
            <button class="btn-primary" onclick="window.location.href='addBankAccount.jsp'">Add Bank Account</button>
        </div>

        <div class="form-container">
            <h2>Recent Transactions</h2>
            <div class="form-group">
                <label>Recent 10 Transactions:</label>
                <p>No transactions found.</p>
            </div>
            <button class="btn-primary" onclick="window.location.href='statement.jsp'">Detailed Statement</button>
        </div>
    </div>
</body>
</html>
