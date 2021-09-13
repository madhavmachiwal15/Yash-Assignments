<%@ page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%= new Date()%>
	<%=(5*4) %>
	<% out.println(5*6); %>
	<%
		String name = request.getParameter("name");
		out.println("Welcome "+name);
	%>
	<%! int a,b,c;%>
	<% 
		 a = Integer.parseInt(request.getParameter("num1"));
		 b = Integer.parseInt(request.getParameter("num2"));
		 
		 c=a+b;
		 
		 out.println("Output is: "+c);
	%>
</body>
</html>