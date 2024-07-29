<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.wipro.servers.Test1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="u" class="com.wipro.servers.Test1"/>
<jsp:setProperty property="name" name="u" value="sunil"/>
<jsp:setProperty property="age" name="u" value="25"/>
<p>name:<jsp:getProperty property="name" name="u" /><p/>
<p>age:<jsp:getProperty property="age" name="u" /><p/>



</body>
</html>