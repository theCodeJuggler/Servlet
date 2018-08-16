<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head></head>
<meta charset="ISO-8859-1">
<title>Account Details</title>
</head>
<jsp:include page="headers.jsp"></jsp:include>
<body>
	<h3 align="center">Customer Details</h3>
	<jstl:if test="${requestScope.allAccount.size() > 0 }">
		<table align="center">
			<tr>
				<th>Customer ID</th>
				<th>Customer Name</th>
				<th>Account Number</th>
				<th>Email ID</th>
				<th>Phone No</th>
				<th>Date Of Birth</th>
			</tr>
			<jstl:forEach var="account" items="${requestScope.allAccount}">
				<tr>
					<td>${account.accountHolder.customerId}</td>
					<td>${account.accountHolder.customerName}</td>
					<td>${account.accountNumber}</td>
					<td>${account.accountHolder.emailId}</td>
					<td>${account.accountHolder.contactNumber}</td>
					<td>${account.accountHolder.dateOfBirth}</td>
					<td><a
						href="editform.AppController?accountNo=${account.accountNumber}"
						class="btn-floating tooltipped btn-small waves-effect waves-light red"
						data-position="bottom" data-tooltip="Update"><i
							class="material-icons" style="font-size: 20px">update</i></a>
				</tr>
			</jstl:forEach>
		</table>
	</jstl:if>
	<jstl:if test="${requestScope.allAccount.size() == 0 }">
		<h4 align="center">No Customer Found!</h4>
	</jstl:if>
	<jsp:include page="footers.jsp"></jsp:include>
</body>
</html>