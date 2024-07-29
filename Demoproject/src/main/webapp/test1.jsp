<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.wipro.servers.Test1" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
Test1 t = new Test1();
t.setName("sunil");
t.setAge(23);
out.println("name is:"+t.getName());
out.println("<br/>");
out.println("age is:"+t.getAge());

%>
</body>
</html>