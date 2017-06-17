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
	<s:form action="user/login">
		<s:textfield name="username" key="用户名" />
		<s:textfield name="password" key="密码" />
		<s:submit value="登录" />
	</s:form>
	
	<h2>下面的内容都是为了适配而添加的：</h2>
	<h2>可以通过下面的链接查看映射：</h2>
	<a href="http://localhost:8080/Struts2-Convention/config-browser/actionNames.action">http://localhost:8080/Struts2-Convention/config-browser/actionNames.action</a>
	
	<h2>说明：适配此项目需要在Action的类上@ResultPath("/content/")注解，否则系统提示找不到映射结果的错误！--dudongbin20170617！</h2>
	<h2>缺点也很明显，每一个类都要这么个注解配置！</h2>
	
	<a href="chain/first">Action链演示</a>
	
</body>
</html>
