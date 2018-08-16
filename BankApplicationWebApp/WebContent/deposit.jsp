<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Deposit</title>
</head>
<body>
<jsp:include page="headers.jsp"></jsp:include>
<form action="doDeposit.AppController" method="GET">
	<div style="align-content: center">
	<h1  class="center-align">Deposit</h1>
		<table>
		<tr>
		<td>Enter Account number</td>
		<td><input type="text" name="accNo"></td>
		<td>Enter Amount</td>
		<td><input type="text" name="amount" placeholder="0.0"></td>
		</tr>
		</table><br><br>
		<div align="center"><input type="submit" value="Deposit"></div>
	</div>
</form>
<jsp:include page="footers.jsp"></jsp:include>
</body>
</html>