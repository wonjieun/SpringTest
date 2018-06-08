<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="http://code.jquery.com/jquery-2.2.4.min.js"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script type="text/javascript">
$(document).ready(function() {
	$("#btnLogin").click(function() {
		location.href="/interceptor/login.do";
	});
	$("#btnLogout").click(function() {
		location.href="/interceptor/login.do";	
		});
	$("#btnAdmin").click(function() {
		$(location).attr("href","admin/main.do");
	});
	$("#btnList").click(function() {
		location.href="/interceptor/board/list.do";
	});
});

</script>

<body>

<div>
<h1>인터 셉터 테스트</h1>
<h3>메인 페이지</h3>
<hr>

${nick }
<!-- /interceptor/login.do -->
<c:if test="${empty login }">
<button id="btnLogin">로그인</button>
</c:if>

<!-- /interceptor/logout.do -->
<c:if test="${login }">
<button id="btnLogout">로그아웃</button>
</c:if>

<!-- /interceptor/admin/main.do -->
<button id="btnAdmin">관리자 페이지로</button>

<!-- /board/list.do -->
<button id="btnList">목록</button>

</div>

</body>
</html>