<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

String name= request.getParameter("stname");
String email=request.getParameter("stemail");
int number=Integer.parseInt(request.getParameter("stno"));

out.println("student name is"+name);
out.println("<br/>");
out.println("student email is"+email);
out.println("<br/>");
out.println("student number is"+number);
out.println("<br/>");

;



%>

</body>
</html>