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
	<c:forTokens items ="TV, Mobile-Laptop" delims = "- ," var = "name">
         <c:out value = "${name}"/><p>
  </c:forTokens>
</body>
</html>