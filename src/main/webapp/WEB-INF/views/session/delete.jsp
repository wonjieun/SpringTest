<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>세션 삭제</h1>
<hr>
<%-- test1: ${sessionScope.test1 }
test2: ${sessionScope.test2 }
test3: ${sessionScope.test3 } --%>

test1: ${test1 }<br>
test2: ${test2 }<br>
test3: ${test3 }<br>
<h3><a href='/session/create.do'>세션 생성</a></h3>
<h3><a href='/session/info.do'>세션 확인</a></h3>

</body>
</html>