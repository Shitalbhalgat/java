<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@ include file="first.jsp" %>

Welcome Student

<br>

Current Date :

<%@ page import="java.util.Date" %>

<%= new Date() %>

<%@ include file="cookie.html" %>
</body>
</html>