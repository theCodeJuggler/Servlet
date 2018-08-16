<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Withdrawal</title>
</head>
<body>
	<jsp:include page="headers.jsp"></jsp:include>
	<h3 align="center">Withdrawal</h3>
	<form action="doWithdraw.AppController" method="GET">
		<table align="center">
			<tr>
				<td>Enter Account number</td>
				<td><input type="text" name="accNo"></td>
			</tr>
			<tr>
				<td>Enter Amount</td>
				<td><input type="text" name="amount" placeholder="0.0"></td>
			</tr>
			<tr>
				<td align="right"><input type="submit" value="Deposit"></td>
			</tr>
		</table>
	</form>
<jsp:include page="footers.jsp"></jsp:include>
</body>
</html>