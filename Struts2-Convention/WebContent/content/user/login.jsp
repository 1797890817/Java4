<%@ page contentType="text/html; charset=GBK" language="java"
	errorPage=""%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>��¼ҳ��</title>
</head>
<body>
	<s:form action="user/login" >
		<s:textfield name="username" key="�û���" />
		<s:textfield name="password" key="����" />
		<s:submit value="��¼" />
	</s:form>
</body>
</html>
