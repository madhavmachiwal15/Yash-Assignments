<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Employee</title>
</head>
<body>
	<form:form method="POST" modelAttribute="employee">

		<label for="name">Enter Id</label> 
		<form:input type="number" path="id" id="id" /> 
		
		<input type="submit" value="Search">
	</form:form>
</body>
</html>