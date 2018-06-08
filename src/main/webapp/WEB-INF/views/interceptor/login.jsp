<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="http://code.jquery.com/jquery-2.2.4.min.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	//포커스 먼저 얻기
	$("#id").focus();
	
});

$(document).ready(function() {
	$("#btnList").click(function() {
		location.href="/interceptor/board/list.do";
	});

});

</script>

<body>

<div>
<h1>인터셉터 테스트</h1>
<h3>로그인 페이지</h3>
<hr>

<div>
<form action="/interceptor/loginProc.do" method="post">
	ID : <input type="text" name="id" id="id" /><br>
	PW : <input type="text" name="pw" id="pw" /><br>
	<button>로그인</button>
</form>
<!-- /board/list.do -->
<button id="btnList">목록</button>
</div>

</div>

</body>
</html>