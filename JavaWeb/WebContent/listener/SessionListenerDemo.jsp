<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Session Listener Demo</title>
</head>
<body>
	<h1>Session Listener Demo</h1>
	<%
		session.setAttribute("sessParam", "Session");
	
		session.setAttribute("sessParam", "Session2");
		
		session.removeAttribute("sessParam");
	
	%>
	
	<a href="<%= request.getContextPath() %>/Servlet/sessionInvalidate">手动销毁会话</a>
</body>
</html>