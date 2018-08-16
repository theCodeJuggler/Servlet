<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account Details</title>
</head>
<jsp:include page="headers.jsp"></jsp:include>
<body>

	<h3 align="center">Account Details</h3>
	<jstl:if test="${requestScope.allAccount.size() > 0 }">
		<table>
			<tr>
				<th>Account Number</th>
				<th>Customer ID</th>
				<th>Account Type</th>
				<th>Account Balance</th>
				<th>Overdraft Limit</th>
				<th>Salary Account</th>
			</tr>
			<jstl:forEach var="account" items="${requestScope.allAccount}">
				<tr>
					<td>${account.accountNumber}</td>
					<td>${account.accountHolder.customerId}</td>
					<jstl:if
						test="${account['class'].simpleName.equals('MMSavingsAccount')}">
						<td>Savings Account</td>
					</jstl:if>
					<jstl:if
						test="${account['class'].simpleName.equals('MMCurrentAccount')}">
						<td>Current Account</td>
					</jstl:if>
					<td>${account.accountBalance}</td>

					<jstl:if
						test="${account['class'].simpleName.equals('MMSavingsAccount')}">
						<td>N/A</td>
						<td>${account.salary}
					</jstl:if>

					<jstl:if
						test="${account['class'].simpleName.equals('MMCurrentAccount')}">
						<td>${account.odLimit}</td>
						<td>N/A
					</jstl:if>
				</tr>
			</jstl:forEach>
		</table>
	</jstl:if>
	<jstl:if test="${requestScope.allAccount.size() == 0 }">
		<h4 align="center">No Accounts Found!</h4>
	</jstl:if>
	<jsp:include page="footers.jsp"></jsp:include>
</body>
</html>
