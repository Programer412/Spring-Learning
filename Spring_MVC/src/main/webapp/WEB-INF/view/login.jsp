<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Login Page</h1>
<%-- <%
String classname=(String)request.getAttribute("Class");
Integer regNumber=(Integer)request.getAttribute("regnumber");
List<String> list=(List)request.getAttribute("nameList");

%>
<h4>Class:<%=classname %></h4>
<h4>Reg number:<%=regNumber %></h4>
<h4>Name:<%=list %></h4> --%>

<h4>Class:${classname}</h4>
<h4>Reg number:${regnumber}</h4>
<h4>Name:${nameList}</h4>
<c:forEach items="${ nameList}" var="n">
<h6>${n}</h6>
<h3><c:out value="${n}"></c:out></h3>
</c:forEach>


</body>
</html>