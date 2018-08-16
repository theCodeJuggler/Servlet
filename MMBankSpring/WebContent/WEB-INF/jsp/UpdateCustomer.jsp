<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Customer Details</title>
</head>
<body>
	<jsp:include page="headers.jsp"></jsp:include>
	<h3 align="center">Update Customer Details</h3>
	<form action="updateAccount.AppController" method="GET">
			<table align="center">
				<tr>
					<td>Customer ID:</td>
					<td><input type="text" name="customerid" value="${requestScope.account.accountHolder.customerId}" readonly></td>
					<td>Customer Name:</td>
					<td><input type="text" name="customerName" value="${requestScope.account.accountHolder.customerName}"></td>
					<td>Account Number:</td>
					<td>
						Browser Select
						<select name="accNo">
							<option value="${requestScope.account.accountNumber}">${requestScope.account.accountNumber}</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>Mobile Number:</td>
					<td><input type="text" name="contactNumber"	value="${requestScope.account.accountHolder.contactNumber}"	pattern="^\d{10}"></td>
					<td>Email ID:</td>
					<td><input type="email" name="email" value="${requestScope.account.accountHolder.emailId}"></td>
					<td>Date of Birth:</td>
					<td><input type="date" name="dateOfBirth" value="${requestScope.account.accountHolder.dateOfBirth}"></td>
				</tr>
			</table>
			<br>
			<br>
			<div align="center">
				<input type="submit" value="Update Changes">
			</div>
	</form>
	<jsp:include page="footers.jsp"></jsp:include>
</body>
</html>