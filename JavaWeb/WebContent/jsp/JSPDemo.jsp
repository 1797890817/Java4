<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSPDemo Page</title>
</head>
<body>
	<!-- 这是HTML注释，这是在浏览器右键的源代码中可见的！ -->
	<%-- 这是JSP的注释，浏览器应该是看不到的！ --%>

	<%!String tmpString = "这是JSP声明一个String类型的变量！";%>

	<%=tmpString%>
	<br />

	<%
		out.println(tmpString);
	%>

	<center>
		<%
			Date today = new Date();
			int hours = today.getHours();
			int minute = today.getMinutes();
			if (hours >= 0 && hours < 12) {
				out.println("欢迎访问，早上好!");
			} else if (hours >= 12 && hours < 19) {
				out.println("欢迎访问，下午好!");
			} else
				out.println("欢迎访问，晚上好!");
		%>
	</center>
	
	<p>现在的时间是：</p>
	<%@ include file="systemTime.html" %>
	<hr/>

</body>
</html>