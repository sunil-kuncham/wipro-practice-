<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- scriptlet tag -->
<% 
int id=100;
String name="Sunil";
out.println("the student id is"+id);
out.println("<br/>");
out.println("the student name is"+name);
out.println("welcome to jsp"); %>
<hr />
<%="the student id is: " + id%><br />
	<%="the student name is: " + name%>
<%!

int stid =111;
String stname="pavan";

public int getSum(int x,int y){
	return x+y;
}

%><br/>
<hr/>
<%="the student id is"+stid%><br/>
<%="the student name is"+stname%><br/>
<%="the sum is"+getSum(4,5) %><br/>

	






</body>
</html>