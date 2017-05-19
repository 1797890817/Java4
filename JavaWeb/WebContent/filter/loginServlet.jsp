<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Servlet</title>
</head>
<body>
	<H2>请输入用户信息:</H2>
	<Form method="get"
		action='<%=request.getContextPath()%>/Servlet/LoginServletDemo'>
		<Label> 用户名：</Label> <Input type='text' name='username'> <br>
		<Label> 密&nbsp;&nbsp;码： </Label> <Input type='password' name='password'><br/>
		<Input type='submit' value='提交'> <Input type='reset' value='重置'> <br>
	</Form>
</body>
</html>