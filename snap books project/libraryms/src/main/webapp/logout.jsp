<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Logout</title>
</head>
<body>
<%
request.removeAttribute("uid");
request.removeAttribute("upass");

session.invalidate();


Thread.sleep(1000*1);
request.getRequestDispatcher("index.jsp").forward(request, response);
%>
</body>
</html>