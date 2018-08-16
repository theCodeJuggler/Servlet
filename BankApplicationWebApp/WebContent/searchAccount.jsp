<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Account</title>
</head>
<body>
	<jsp:include page="headers.jsp"></jsp:include>
	<h3 align="center">Search Account</h3>
	<form action="search.AppController" method="GET">
		<table align="center">
			<tr>
				<td>Enter Account Number:</td>
				<td><input type="text" name="search"></td>
			</tr>
			<tr>
				<td align="right"><input type="submit" value="Update"></td>
			</tr>
		</table>
	</form>
	<jsp:include page="footers.jsp"></jsp:include>
</body>
</html>