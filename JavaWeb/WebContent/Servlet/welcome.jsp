<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1><%= session.getAttribute("userId") %> &nbsp; 您好，欢迎访问我们的网页！</h1>
	<h1>${userId} &nbsp; 您好，欢迎访问我们的网页！</h1>
	
	<p>注销</p>
	<a href="<%=request.getContextPath() %>/Servlet/sessionInvalidate">注销</a>
</body>
</html>