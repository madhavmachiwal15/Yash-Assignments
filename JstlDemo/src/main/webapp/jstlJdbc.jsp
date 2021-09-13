<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix ="fn" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix ="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<sql:setDataSource var="mydb" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/mydb"  
     user="root"  password="root"/>  
     
      <sql:update dataSource = "${mydb}">
         insert into users values(404, "500");
      </sql:update>
     
     <sql:query dataSource="${mydb}" var="rws">  
		select * from users;  
	 </sql:query>  
	 
	 <table border="1">
	 	<tr>
	 		<th>userid</th>
	 		<th>pwd</th>
	 	</tr>
	 	<c:forEach var="table" items="${rws.rows}">
	 	<tr>
	 		<td><c:out value="${table.userid}"/></td>
	 		<td><c:out value="${table.pwd}"/></td>
	 	</tr>
	 	</c:forEach>
	 </table>
</body>
</html>