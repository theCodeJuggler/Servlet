<%@page import="com.abc.implementation.Resume"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Resume resume = (Resume) request.getAttribute("ResumeRequest");
	%>
	<div>
		<div>
			<h1><%=resume.getFname()%>
				<%=resume.getLname()%></h1>
		</div>
		<div><%=resume.getAddress()%></div>
		<div>
			Contact:
			<%=resume.getContact()%></div>
		<div>
			E-Mail:
			<%=resume.getMail()%></div>
	</div>
	<br>
	<br>
	<center>
		<b>Career Objectives</b>
	</center>
	<hr>
	<%=resume.getSummary()%><br>
	<br>
	<br>
	<br>
	<center>
		<b>Educational Qualifications</b>
	</center>
	<hr>
	<%=resume.getQualification()%>
	<br>
	<br>
	<br>
	<center>
		<b>Skills</b>
	</center>
	<hr>
	<%
		for (String skill : resume.getSkills()) {
	%>
	<%=skill%>&nbsp&nbsp<%
		}
	%>
	<br>
	<br>
	<br>
	<br>
	<center>
		<b>Personal Details</b>
	</center>
	<hr>
	<table>
		<tr>
			<td>Date of Birth</td>
			<td>:</td>
			<td><%=resume.getDob()%></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td>:</td>
			<td><%=resume.getGender()%></td>
		</tr>
		<tr>
			<td>Hobbies</td>
			<td>:</td>
			<td>
				<%
					for (String hobby : resume.getHobbies()) {
				%> <%=hobby%>&nbsp&nbsp <%} %>
			</td>
		</tr>
		<tr>
			<td>Website URL</td><td>:</td>
			<td><%=resume.getSite()%></td>
		</tr>
	</table>
</body>
</html>