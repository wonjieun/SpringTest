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
	$("#btnWirte").click(function() {
		location.href="/board/write.do";
	});
});
</script>

<body>



<div>
<h1>목록 보이기</h1>
<h3>비로그인 시에도 목록을 보여줘봐~</h3>
<hr>
<button id="btnWirte">글쓰기</button>

</div>

</body>
</html>