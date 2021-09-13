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
	<c:set var="balance" value="30500.8970"/>
	<fmt:setLocale value = "en_US"/>
	<h4>Format 1: <fmt:formatNumber value = "${balance}" type = "currency"/></h4>
	
	 <h4>Format 2: <fmt:formatNumber type ="number" 
         maxIntegerDigits = "3" value = "${balance}" /></h4>
         
     <h4>Format 3: <fmt:formatNumber type ="number" 
         maxFractionDigits = "3" value = "${balance}" /></h4>
         
     <fmt:parseNumber var="i" type="number" value="${balance}"/>  
     <h4>Parsed number 1: <c:out value="${i}"/></h4>  
     
     <fmt:parseNumber var="i" type="number" integerOnly="true" value="${balance}"/>  
     <h4>Parsed number 1: <c:out value="${i}"/></h4>  
     
     <h1>Date Parsing</h1>
	 <c:set var="now" value="26/08/2021"/>
	 <fmt:parseDate value="${now}" var="j" pattern = "dd/MM/yyyy"/>
	 <h4>Parsed Date: <c:out value="${j}"/></h4>
	 
	  <c:set var = "str" value = "I am using STS"/>

      <c:if test = "${fn:endsWith(str, 'STS')}">
         <p>String ends with STS<p>
      </c:if>

      <c:if test = "${fn:endsWith(str, 'am')}">
         <p>String ends with am<p>
      </c:if>
      
      <h4>Index is: ${fn:indexOf(str, 'using')}</h4>
      <h4>Index is: ${fn:indexOf(str, 'S')}</h4>
      <h4>Lenght is: ${fn:length(str)}</h4>
      <h4>Replace: ${fn:replace(str, 'STS', 'Eclipse')}</h4>
      <c:out value="${str}"/>
</body>
</html>