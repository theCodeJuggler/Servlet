<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<form action="withdrawAction.bank" method="get">
		<table align="center">
			<tr>
				<td>Enter The Account Number : </td><td><input type="number" name="accNo"></td>
			</tr>
			<tr>
				<td>Enter The Amount : </td><td><input type="number" name="amt"></td>
			</tr>
			<tr>
				<td><input type="submit" name="withdrw" value="Withdraw"></td><td><input type="reset" value="clear"></td>
			</tr>
		</table>
	</form>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>