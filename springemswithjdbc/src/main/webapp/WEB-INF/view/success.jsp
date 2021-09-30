<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Enrollment Detail Confirmation</title>
</head>
<body>
	<div>
		Message : ${success} <br><br> 
		Your details: <br><br>
		Name: ${employee.name} <br>
		Salary: ${employee.salary} <br>
		Department: ${employee.department} <br>
		Designation: ${employee.designation} <br>
		Address: ${employee.address} <br>
		
	</div>
</body>
</html>
