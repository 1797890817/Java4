<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
<title>初始化参数获取</title>
</head>
<body>
	<!-- http://localhost:8180/JavaWeb/config.init -->
	<%
		String dbDriver = config.getInitParameter("driver");
		String dbUrl = config.getInitParameter("url");
	%>
	<h3>
		驱动程序：<%=dbDriver%></h3>
	<h3>
		连接地址：<%=dbUrl%></h3>
</body>
</html>