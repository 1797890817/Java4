<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Servlet Context Listener Demo</title>
</head>
<body>
	<h1>Servlet Context Listener Demo</h1>
	<%
		//同一个变量第一次设置，触发属性添加的方法
		this.getServletContext().setAttribute("user", "wangwu");
		application.setAttribute("password", "123456");
		//同一个变量第二次设置，触发属性替换的方法
		this.getServletContext().setAttribute("user", "zhaosi");
		application.setAttribute("password", "654321");
		
		//删除属性
		this.getServletContext().removeAttribute("user");
		application.removeAttribute("password");
		
	%>
	
</body>
</html>