<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix ="fn" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix ="fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:url value ="corejstl.jsp" var ="myURL">
		<c:param name = "trackingId" value ="1234"/>
		<c:param name = "reportType" value ="summary"/>
	</c:url>
<c:import url = "${myURL}"/>
</body>
</html>