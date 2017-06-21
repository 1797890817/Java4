<%@ page contentType="text/html; charset=GBK" language="java"
	errorPage=""%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>登录页面</title>
</head>
<body>
	<s:form action="login" namespace="/user" >	<!-- 这个namespace的值会变成url的前面部分，action的值紧跟后面 -->
		<s:textfield name="username" key="用户名" />
		<s:textfield name="password" key="密码" />
		<s:submit value="登录" />
	</s:form>
</body>
</html>
