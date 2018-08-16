<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>MoneyMoneyBankApplication</title>
</head>
<body>
	<jsp:include page="headers.jsp"></jsp:include>
	<div align="center">
		<p>
			<a href="addSavings.AppController">Create New Savings Account</a>
		</p>
		<p>
			<a href="addCurrent.AppController">Create New Current Account</a>
		</p>
		<p>
			<a href="viewAll.AppController">View All Accounts</a>
		</p>
		<p>
			<a href="viewCustomers.AppController">View All Customers</a>
		</p>
		<p>
			<a href="createSearch.AppController">SearchAccount</a>
		</p>
		<p>
			<a href="withdrawl.AppController">Withdraw amount from account</a>
		</p>
		<p>
			<a href="deposit.AppController">Deposit amount to account</a>
		</p>
		<p>
			<a href="fundTransfer.AppController">Transfer Funds</a>
		</p>
		<p>
			<a href="updateAccount.AppController">Update Account Information</a>
		</p>
	</div>
</body>
<jsp:include page="footers.jsp"></jsp:include>
</html>