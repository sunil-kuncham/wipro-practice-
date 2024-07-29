<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.Date"%>
    <%@ include file="Demo.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<p>First no<%=request.getParameter("t0") %><p/><br/><br/>
<p>second no<%=request.getParameter("t1") %><p/>
</body>
</html>