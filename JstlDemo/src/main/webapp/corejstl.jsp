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
<c:out value="${'Welcome'}"/>
<c:set var ="i" value ="90" scope ="application"></c:set>
<h1> <c:out value="${i}"></c:out> </h1>
<c:set var="number" scope="session" value="${30000}"/>
<c:if test="${number>=20000}">
<h4>number is: <c:out value="${number}"/></h4>	
</c:if>
<c:choose>
	<c:when test="${number<=10000}">
		Number is less than or equal to 10000
	</c:when>
	<c:when test="${number>=10000}">
		Number is greater than or equal to 10000
	</c:when>
	<c:otherwise>
		Invalid Data
	</c:otherwise>
</c:choose>

<c:forEach var="j" begin="1" end="10">
	<h5>Value : <c:out value="${j}"/></h5>
</c:forEach>
<c:set var ="a" value ="40" scope ="application"></c:set>
<c:out value="${a}"></c:out>
<br>
<c:remove var="a"/>
<h5>After removing number is: <c:out value="${a}"></c:out></h5>

<c:set var="name" value="hello welcome"/>
<p><b>Name is: <c:out value="${name}"></c:out></b></p>

<c:if test="${fn:containsIgnoreCase(name, 'Welcome')}">
<p>Welcome is found!!</p>
</c:if>

<c:set var="date" value="<%=new java.util.Date() %>"/>
<c:out value="${date}"/>
<br>
<fmt:formatDate value="${date}"/>
<br>
<fmt:formatDate type="both" dateStyle="medium" value="${date}"/>
</body>
</html>