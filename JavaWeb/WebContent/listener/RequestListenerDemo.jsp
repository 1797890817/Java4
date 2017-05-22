<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Request Listener Demo</h1>
	<%
		request.setAttribute("username", "zhangsan");	//第一次是触发属性增加事件
		request.setAttribute("username", "lisi");		//重复赋值触发属性替换事件
		request.removeAttribute("username");			//触发属性删除事件
	%>

</body>
</html>