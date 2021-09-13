<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Page</title>
</head>
<body>
	<%
		String data = (String) session.getAttribute("session-user");
		out.println("Welcome "+data);
	%>
</body>
</html>