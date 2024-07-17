<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to home page</h1>

<%
String name=(String)request.getAttribute("name");
Integer roll=(Integer)request.getAttribute("roll");
List<String> list=(List)request.getAttribute("namelist");
%>


<h2>Name:<%=name %></h2>
<h2>ROll name:<%=roll %></h2>
<h3>Name list:<%=list %></h3>

<h4> by using for each loop
<br>
Name:
<%
for(String s:list)
{%>
	<h4><%=s %></h4>
<% }
%>

</h4>
<a href="login">login</a>
</body>
</html>