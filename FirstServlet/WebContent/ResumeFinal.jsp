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
	Resume resume = (Resume)request.getAttribute("ResumeRequest");
%>

<%=resume.getFname()%><br>
<%=resume.getLname()%><br>
<%=resume.getGender()%><br>
<%for(String hobby:resume.getHobbies()){
	%>
	<%=hobby %>&nbsp&nbsp<%
} %>
<%=resume.getDob()%><br>
<%=resume.getQualification()%><br>
<%=resume.getAddress()%><br>
<%for(String skill:resume.getSkills()){
	%>
	<%=skill %>&nbsp&nbsp<%
} %>
<%=resume.getMail()%><br>
<%=resume.getSite()%><br>
<%=resume.getSummary()%><br>
<%=resume.getContact()%><br>
</body>
</html>