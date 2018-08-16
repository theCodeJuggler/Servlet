<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Savings account</title>
</head>
<body>
<jsp:include page="headers.jsp"></jsp:include>
<div align="center">
   <h4>Enter Account Details</h4>
</div>
<form action="addSavingsAccount" method="GET">
	<div align="center">
		<table>
			<tr>
				<td>Enter Customer Name:</td>
				<td><input type="text" name="customerName"></td>
			</tr>
			<tr>
				<td >Enter Mobile Number:</td>
				<td><input type="text" name="contactNumber" max=10 pattern="[6-9][0-9]{9}"></td>
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
				<td >Enter Nationality:</td>
				<td><input type="text" name="nationality"></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><input type="radio"  name="gender" value="Male" checked><span>Male</td>
				<td><input type="radio"  name="gender" value="Female">Female</td>
			</tr>
			<tr>
				<td>Will this be a salary<br>account?</td>
				<td><input type="radio"  name="salaried" value="true" checked>Yes</td>
				<td><input type="radio"  name="salaried" value="false">No</td>

			</tr>
			<tr>
				<td>Enter the initial balance<br>(Minimum Rs.5000.00 if<br>not salaried)</td>
				<td><input type="text" name="balance" placeholder="RS."></td>
				<td></td><td></td>
			</tr>
			<tr>
				<td align="right"><input type="submit" value="Create Account"></td>
				<td><input type="reset" value="Clear"></td>
			</tr>
		</table>
	</div>
</form>
<jsp:include page="footers.jsp"></jsp:include>
</body>
</html>