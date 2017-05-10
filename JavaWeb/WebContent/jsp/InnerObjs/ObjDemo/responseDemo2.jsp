<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>RequestObjDemo2</title>
</head>
<body>
	<% 
	Cookie c1 = new Cookie("name","zhangsan");	
	//若想支持中文，要对值使用编码和解码
	
	Cookie c2 = new Cookie("age","36");
	c1.setMaxAge(3);
	c2.setMaxAge(3);
	response.addCookie(c1);
	response.addCookie(c2);
	%>
	<a href="responseDemo21.jsp">链接</a>
	
</body>
</html>