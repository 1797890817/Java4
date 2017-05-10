<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <%@ page isELIgnored="true" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here2</title>
<%
	Cookie cookie1 = new Cookie("country","china");
	cookie1.setMaxAge(120);
	response.addCookie(cookie1);
%>
</head>
<body>
	<span>浏览器信息：</span>${header['User-Agent']}<br />
	<span>Connection信息：</span>${header['Connection']}<br />
	<span>Host信息：</span>${header['Host']}<br />
	<span>${'${'}pageContext.session.id }：</span>${pageContext.session.id }<br />
	<%-- <span>${'${'}pageContext.session.new }：</span>${pageContext.session.new }<br/> --%> <!--  tomcat6.0 OK -->
	<%-- <span>${'${'}pageContext.session.isNew() }：</span>${pageContext.session.isNew()}<br/> --%>
	<!-- http://localhost:8180/JavaWeb/EL/ELDemo3.jsp?count=10 -->
	<span>${'${'}param.count} </span> ${param.count}<br/>
	<span>${'${'}param.count + 20} </span> ${param.count + 20}
	<br />
	<span>${'${'}cookie.country}</span> ${cookie['country']}
	<span>${'${'}cookie}</span>
	<hr />
	${cookie.country.name}<br/>
	${cookie.country.value}<br/>
	${cookie['country'].name }<br/>
	${cookie['country'].value }<br/>
	<hr />
	${initParam.rri}<br>
	<%=(String)application.getInitParameter("rri") %><br>
	config:<%= config.getInitParameter("rri") %>

</body>
</html>