<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Session</title>
</head>
<body>
	<form action="loginReceive.jsp" method="post">
		<span>用户名：</span> <input name="userName" type="text" /> <br /> 
		<span>密&nbsp;码：</span>
		<input name="passWord" type="password" /> <br /> 
		<input name="submit" type="submit" value="登录" /> 
		<input name="submit" type="reset" value="重置" />
	</form>

</body>
</html>