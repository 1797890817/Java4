<%@ page contentType="text/html; charset=GBK" language="java"
	errorPage=""%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>登录成功</title>
</head>
<body>
	欢迎，${username},您已经登录！
	<br />
	<a href="${pageContext.request.contextPath}/
		book/get-books.action">查看作者李刚已出版的图书</a>
</body>
</html>