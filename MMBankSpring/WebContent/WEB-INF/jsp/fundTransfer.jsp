<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fund Transfer</title>
</head>
<jsp:include page="headers.jsp"></jsp:include>
<body>
<h4 align="center">Transfer Fund</h4>
<form action="doFundTransfer.AppController" method="GET">
		<table align="center">
		<tr>
		<td>Enter Sender's Account number</td>
		<td><input type="text" name="accNoSender"></td>
		</tr>
		<tr>
		<td>Enter Recievers's Account number</td>
		<td><input type="text" name="accNoReciever"></td>
		</tr>
		<tr>
		<td>Enter Amount</td>
		<td><input type="text" name="amount" placeholder="0.0"></td>
		</tr>
		</table><br><br>
		<div align="center"><input type="submit" value="Transfer Funds"></div>
</form>
</body>
<jsp:include page="footers.jsp"></jsp:include>
</html>