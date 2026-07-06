<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%!int a = 10;

	public int cube(int n) {
		return n * n * n;
	}%>

	<%
	int b = 20;

	out.println("Value of B = " + b);
	%>

	<br> Value of A = <%=a%>

	<br> Cube = <%=cube(5)%>

</body>

</html>
