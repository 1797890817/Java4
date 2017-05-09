<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>RequestObjDemo</title>
</head>
<body>
	<%-- 获取request范围属性值   可以查看浏览器上的对应值--%>
	<%
		Enumeration enu = request.getHeaderNames();
		while (enu.hasMoreElements()) {
			String headerName = (String) enu.nextElement();
			String headerValue = request.getHeader(headerName);
	%>
	<h5>
		headerName:<%=headerName%>
		----- headerValue:<%=headerValue%>
	</h5>
	<%
		}
	%>


</body>
</html>