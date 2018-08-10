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
	<br>
	<div align="center">
		<a href="addAcc.bank" >Add New Account</a><br><br>
		<a href="vwAcc.bank" >View All Accounts</a><br><br>
		<a href="srch.bank" >Search</a><br><br>
		<a href="wthdrw.bank" >Withdraw</a><br><br>
		<a href="depst.bank" >Deposit</a><br><br>
		<a href="fundTrnsfr.bank" >Fund Transfer</a><br><br>
	</div>
	<br>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>