<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.ddb.javaweb.listener.*"%>
<%@page import="com.ddb.javaweb.bean.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Session Bind Demo</title>
</head>
<body>
	<h1>向session中保存bookBean对象</h1>

	<%
		//javabean 不能触发监听器
		BookBean book = new BookBean("JavaWeb",25);	
		session.setAttribute("BookBean", book);
		
		SessionBindListenerDemo sbd = new SessionBindListenerDemo(36);
		session.setAttribute("sbd", sbd); 
		
	%>
</body>
</html>