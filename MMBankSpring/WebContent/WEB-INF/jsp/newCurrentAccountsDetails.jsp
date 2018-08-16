<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a savings account</title>
</head>
<body>
<jsp:include page="headers.jsp"></jsp:include>
<h4 align="center">Enter Account Details</h4>
<form action="addCurrentAccount" method="GET">
		<table align="center">
			<tr>
				<td >Enter Customer Name:</td>
				<td><input type="text" name="customerName"></td>
			</tr>
			<tr>
				<td >Enter Mobile Number:</td>
				<td><input type="text" name="contactNumber" pattern="^\d{10}"></td>
			</tr>
			<tr >
				<td >Enter Email ID:</td>
				<td><input type="email" name="email"></td>
			</tr>
			<tr>
				<td >Enter Date of Birth:</td>
				<td><input type="date" name="dateOfBirth"></td>
			</tr>
			<tr>
				<td >Enter Address:</td>
				<td><input type="text" name="address"></td>
			</tr>
			<tr>
				<td>Enter Nationality:</td>
				<td><input type="text" name="nationality"></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><input type="radio" name="gender" value="Male" checked>Male</td>
				<td><input type="radio" name="gender" value="Female">Female</td>
			</tr>
			<tr>
				<td>Enter overdraft limit</td>
				<td><input type="text" name="overdraft"></td>
			</tr>
			<tr>
				<td>Enter the initial balance<br>(Minimum Balance Rs. 10,000.00)</td>
				<td><input type="text" name="balance" placeholder="Rs."></td>
			</tr>
			<tr>
				<td align="right"><input type="submit" value="Create Account"></td>
				<td><input type="reset" value="Clear"></td>
			</tr>
		</table>
</form>
<jsp:include page="footers.jsp"></jsp:include>
</body>
</html>