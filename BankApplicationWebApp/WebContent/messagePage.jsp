<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Message</title>
</head>
<body>
	<jsp:include page="headers.jsp"></jsp:include>
	<form action="index.jsp" method="GET">
		<h2>${requestScope.message}</h2>
		<br> <br>
		<br> <input type="submit" value="Home">
	</form>
	<jsp:include page="footers.jsp"></jsp:include>
</body>
</html>