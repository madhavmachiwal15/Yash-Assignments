<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Registration Form</title>

</head>
<body>

	<h1>Registration Form</h1>
	<form:form method="POST" modelAttribute="employee">

		<label for="id">Id</label><br>
		<form:input type="text" path="id" id="id" /><br><br>

		<label for="name">Name</label><br>
		<form:input type="text" path="name" id="name" /><br><br>

		<label for="salary">Salary</label><br>
		<form:input type="number" path="salary" id="salary" /><br><br>

		<label for="department">Department</label><br>
		<form:radiobuttons path="department" items="${department}" /><br><br>

		<label for="email">Designation</label><br>
		<form:input type="text" path="designation" id="designation" /><br><br>

		<label for="address">Address</label><br>
		<form:select path="address" id="address">
			<form:option value="">Select Country</form:option>
			<form:options items="${countries}" />
		</form:select><br><br>

		<input type="submit" value="Register">

	</form:form>
</body>
</html>