<%@page import="java.util.HashSet"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String[] books = { "Java Web程序设计", "操作系统", "Java语言程序设计", "C语言程序设计" };
		request.setAttribute("book", books);
	%>
	全部书目：
	<br />
	<c:forEach var="bookName" items="${book}">
  		${bookName}<br />
	</c:forEach>

	<hr />
	部分书目：
	<br />
	<c:forEach var="bookName" items="${book}" begin="1" end="2">
		 ${bookName}<br />
	</c:forEach>
	<hr />

	全部书目：
	<br />
	<c:forEach var="bookName" items="${book}" begin="0" end="3"
		varStatus="status">
		${status.index} --- ${status.current} --- ${status.count} --- ${bookName}<br />
	</c:forEach>
	<hr />

	显示从1到15的整数值：步长为1
	<br />
	<c:forEach var="i" begin="1" end="15">
  		${i}&nbsp;
	</c:forEach>
	<hr />
	显示从1到15的整数值：步长为1
	<br />
	<c:forEach var="i" begin="1" end="15" step="1">
  		${i}&nbsp;
	</c:forEach>

	<hr />
	显示从1到15的整数值：步长为3
	<br />
	<c:forEach var="i" begin="1" end="15" step="3">
  		${i}&nbsp;
	</c:forEach>

	<hr/>
	<p>JSTL 访问集合</p>
	<%
		ArrayList<String> list = new ArrayList<String>();
		list.add("JavaBase");
		list.add("WebBase");
		list.add("JavaWeb");
		list.add("Database");
		list.add("JavaEE");
		pageContext.setAttribute("list", list);
		
		HashSet<String> set = new HashSet<String>();
		set.add("JavaBase22");
		set.add("WebBase22");
		set.add("JavaWeb22");
		set.add("Database22");
		set.add("JavaEE22");
		pageContext.setAttribute("set", set);

		HashMap<String,String> map = new HashMap<String,String>();
		map.put("01", "Java编程思想");
		map.put("02", "研磨设计模式");
		map.put("03", "Java虚拟机原理");
		map.put("04", "Html5权威指南");
		pageContext.setAttribute("map", map);
	%>

	<p>使用forEach遍历List的内容：</p>
	<c:forEach var="item" items="${list}" >
		<c:out value="${item}"></c:out><br/>
	</c:forEach>
	<p>使用forEach遍历set的内容：</p>
	<c:forEach var="item" items="${set}" >
		<c:out value="${item}"></c:out><br/>
	</c:forEach>
	<p>使用forEach遍历map的内容：</p>
	<c:forEach var="item" items="${map}" >
		<c:out value="${item}"></c:out><br/>
	</c:forEach>
	<p>使用forEach遍历map的内容：</p>
	<c:forEach var="item" items="${map}" >
		<c:out value="${item.key}"></c:out> ---- <c:out value="${item.value}"></c:out><br/>
	</c:forEach>

</body>
</html>