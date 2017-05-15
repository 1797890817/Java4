<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.ddb.javaweb.bean.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:catch var="error">		<!-- 捕获可能出现的异常 -->
		<c:set var="count" value="${param.c+1}" scope="page" />
        	删除之前，变量count的值为：<c:out value="${count}" />
		<br>
		<c:remove var="count" scope="page" />
        	删除之后，变量count的值为：<c:out value="${count}" />
		<br>
	</c:catch>
	<jsp:useBean id="bb" class="com.ddb.javaweb.bean.BookBean" scope="page" />	<!-- 实例化bb对象 -->
	<c:set target="${bb }" property="bookName" value="${param.name}" />
	<%-- <c:set target="${bb}" property="bookName" value="${param.name}" /> --%>
	bb.bookName:
	<c:out value="${bb.bookName}" />	
	<br>
	<c:out value="${error}" />	<!-- 输出错误信息 -->
	
	<c:out value="<h1><b>JavaWeb 真好学！</b></h1>" escapeXml="false"></c:out>

</body>
</html>