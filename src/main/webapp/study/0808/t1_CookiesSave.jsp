<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String mid = "hkd1234";
	Cookie cookieMid = new Cookie("cmid", mid);
	cookieMid.setMaxAge(60*60*24); // 쿠키의 만료시간(초) : 1일
	response.addCookie(cookieMid);
	
	String pwd = "12341234";
	Cookie cookiePwd = new Cookie("cpwd", pwd);
	cookiePwd.setMaxAge(60*60*24); // 쿠키의 만료시간(초) : 1일
	response.addCookie(cookiePwd);
%>
<script>
	alert("쿠키가 저장되었습니다.");
	location.href = 't1_Cookies.jsp';
</script>