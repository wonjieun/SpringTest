<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="http://code.jquery.com/jquery-2.2.4.min.js"></script>

<script type="text/javascript">
</script>

</head>
<body>

<hr>
<form action="/param/param.do" method="post">
	<label for="name">이름 :
	<input type="text" id="name" name="name" /></label><br>
	
	<label for="age">나이 :
	<input type="text" id="age" name="age" /></label><br>
	
	<input type="submit" value="등록" />
</form>



</body>
</html>