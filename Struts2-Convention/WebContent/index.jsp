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
	<s:form action="user/login">
		<s:textfield name="username" key="�û���" />
		<s:textfield name="password" key="����" />
		<s:submit value="��¼" />
	</s:form>
	
	<h2>��������ݶ���Ϊ���������ӵģ�</h2>
	<h2>����ͨ����������Ӳ鿴ӳ�䣺</h2>
	<a href="http://localhost:8080/Struts2-Convention/config-browser/actionNames.action">http://localhost:8080/Struts2-Convention/config-browser/actionNames.action</a>
	
	<h2>˵�����������Ŀ��Ҫ��Action������@ResultPath("/content/")ע�⣬����ϵͳ��ʾ�Ҳ���ӳ�����Ĵ���--dudongbin20170617��</h2>
	<h2>ȱ��Ҳ�����ԣ�ÿһ���඼Ҫ��ô��ע�����ã�</h2>
	
	<a href="chain/first">Action����ʾ</a>
	
</body>
</html>
