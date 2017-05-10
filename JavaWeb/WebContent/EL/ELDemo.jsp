<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <%@ page isELIgnored="true" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%
	 pageContext.setAttribute("color", "red"); 
	 pageContext.setAttribute("color", "blue"); 
	 pageContext.setAttribute("color", "white"); 
	/* request.setAttribute("color", "pink"); */
	/* session.setAttribute("color", "yellow"); */
	application.setAttribute("color", "green");
%>

</head>
<!-- <body> -->
<%-- <body bgcolor="${color}"> --%>
<%-- <body bgcolor="${applicationScope.color}"> --%>
<%-- <body bgcolor="${applicationScope.color}"> --%>
<!-- <body bgcolor=${color}> -->
<body bgcolor='${color}'>
<!-- <body bgcolor="gsdgs"> -->
	<p>This is body!</p>
	
	<%-- ${10+5} --%>
	<span>${'${'} "Hello World!" }:</span><span>${"Hello World!"}</span><br/>
	<span>${'${'}10}：</span>${10}<br />
	<span>${'${'}null}：</span>${null}<br />
	<span>${'${'}10.5}：</span>${10.5}<br />
	
	<hr/>
	<p>基础运算</p>
	<hr/>
	<span>5+3:</span> ${5+3}
	<br />
	<span>5-3:</span> ${5-3}
	<br />
	<span>5*3:</span> ${5*3}
	<br />
	<span>5/3:</span> ${5/3}
	<br />
	<%-- <span>5 div 3:</span> ${5 div 3} --%>		<!-- 虽然报错，但是不要紧，紧跟在一起虽然不报错，但是异常！ -->
	<br />
	<span>5%3:</span> ${5%3}
	<br />
	<span>5mod3:</span> ${5 mod 3}
	<br />
	<hr/>
	<p>逻辑运算</p>
	<hr/>
	<span>true and true:</span> ${true and true}<br/>
	<span>true && true:</span> ${true && true}<br/>
	<span>true || true:</span> ${true || true}<br/>
	<span>true or true:</span> ${true or true}<br/>
	<span>true:</span> ${true}<br/>
	<span>not true:</span> ${not true}<br/>
	<span>! true:</span> ${! true}<br/>
	<span>true and false:</span> ${true and false}<br/>
	<span>true && false:</span> ${true && false}<br/>
	<span>true || false:</span> ${true || false}<br/>
	<span>true or false:</span> ${true or false}<br/>
	<hr/>
	<p>关系运算</p>
	<span>7 == 5 :</span>${ 7==5}<br/>
	<span>7 eq 5 :</span>${ 7 eq 5}<br/>
	<%-- <span>7 ne 5 :</span>${ 7 ne 5}<br/> --%>
	<span>7 > 5 :</span>${ 7>5}<br/>
	<span>7 gt 5 :</span>${ 7 gt 5}<br/>
	<span>7 &ge; 5 :</span>${ 7 gt 5}<span>****</span><br/>
	<span>7 >= 5 :</span>${ 7 >= 5}<br/>
	<span>7 ge 5 :</span>${ 7 ge 5}<br/>
	<span>7 < 5 :</span>${ 7 < 5}<br/>
	<span>7 &lt; 5 :</span>${ 7 < 5}<br/>
	<span>7 lt 5 :</span>${ 7 lt 5}<br/>
	<span>7 <= 5 :</span>${ 7 <= 5}<br/>
	<span>7 &le; :</span>${ 7 <= 5}<br/>
	<span>7 le 5 :</span>${ 7 le 5}<br/>
	<hr/>
	<p>空判断：</p>
	<span>${ '${'} empty '' }</span>${empty '' }<br/>
	<span>${ '${'} empty 'abc' }</span>${empty 'abc' }<br/>
	<span>${ '${'} empty "abc" }</span>${empty "abc" }<br/>
	<hr/>
	<p>三目运算符：</p>
	<span>${'${'}!A? 0:1 }</span>${!A? 0:1 }<br/>
	<span>${'${'}A? 0:1 }</span>${A? 0:1 }<br/>
	<span>${'${'}A==true? 0:1 }</span>${A==true ? 0:1 }<br/>
	<span>${'${'}A!=true? 0:1 }</span>${A!=true ? 0:1 }<br/>
	<span>${'${'}A=true? 0:1 }</span>${A=true ? 0:1 }<br/>
	<span>${'${'}A=(true? 0:1) }</span>${A=(true ? 0:1) }<br/>
	<span>${'${'}A!=0? 0:1 }</span>${A!=0 ? 0:1 }<br/>
	<span>${'${'}A==0? 0:1 }</span>${A==0 ? 10:11 }<br/>
	<hr/>
	<p>变量范围：</p>
	<span>A = </span>${A }<br/>
	<span>pageScope.A = </span>${pageScope.A }<br/>
	<span>pageScope[A] = </span>${pageScope['A']}<br/>
	<span>pageScope[A] = </span>${pageScope["A"]}<br/>
	<span>pageScope.B = </span>${pageScope.B }<br/>
	<span>pageScope[B] = </span>${pageScope['B'] }<br/>
	<span>pageScope[B] = </span>${pageScope["B"] }<br/>
	<span>${'${'}A==0? 1:0 }</span>${A==0 ? 1:0 }<br/>
	<span>requestScope.A = </span>${requestScope.A }<br/>
	<span>sessionScope.A = </span>${sessionScope.A }<br/>
	<span>applicationScope.A = </span>${applicationScope.A }<br/>

</body>
</html>