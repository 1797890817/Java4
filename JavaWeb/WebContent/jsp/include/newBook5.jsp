<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>new book 5</title>
</head>
<body>
	<p>new book 5</p>
	<p>获取传递的参数： </p>
	<span>姓名：</span> <%= request.getParameter("name") %> 
	<br/>
	<span>年龄：</span> <%= request.getParameter("age") %>
</body>
</html>