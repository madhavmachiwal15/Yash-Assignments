<%
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	int result = num1-num2;
%>
<jsp:forward page="/result.jsp">
<jsp:param value="<%=result %>" name="result"/>
</jsp:forward>