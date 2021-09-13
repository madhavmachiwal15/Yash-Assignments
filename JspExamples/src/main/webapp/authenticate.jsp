<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Authentication Page</title>
</head>
<body>
	<%
		String user = request.getParameter("id");
		String pwd = request.getParameter("pass");
		session.setAttribute("session-user", user);
		if(user.equals("madhav") && pwd.equals("admin"))
		{
			response.sendRedirect("user.jsp");
		}
		else
		{
			response.sendRedirect("fail.jsp");
		}
	%>
</body>
</html>