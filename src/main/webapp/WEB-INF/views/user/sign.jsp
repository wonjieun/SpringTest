<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>회원 가입</h1>
<hr>
<form action="/user/sign.do" method="post">
	<label>ID : <input type="text" name="id" /></label><br>
	<label>PW : <input type="text" name="pw" /></label><br>
	<label>E-MAIL : <input type="text" name="email" /></label><br>
	<label>PHONE : <input type="text" name="phone" /></label><br>
	<button>전송</button>
</form>
</body>
</html>