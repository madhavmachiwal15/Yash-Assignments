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
		String str = (String) session.getAttribute("session-user");
		out.println("Hello "+str+" your User or Password is wrong!! Try Again...");
	%>
</body>
</html>