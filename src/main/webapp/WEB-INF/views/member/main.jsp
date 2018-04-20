<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
function deleteAct(idx) {
	console.log("deleteAct() called");
	console.log("idx: " + idx);  // 삭제될 member의 idx
	
	// /member/delete.do
	// Request Parameter: idx
	
	// GET으로 요청하기
	location.href="/member/delete.do?idx=" + idx;
	
	// POST로 요청하기
	//form 태그를 이용해서 전달해야 함
	
	// 1. Javascript 코드를 이용해서 <form> 만들기
	// 2. JQuery 사용하기 (updateAct에 작성)
	// 3. JQuery 변형하기 (deleteAct에 작성)
	var form = document.createElement("form");
	form.method = 'post';
	form.action = '/member/delete.do';
	
	var idxInput = document.createElement('input');
	idxInput.type = 'hidden';
	idxInput.name = 'idx';
	idxInput.value = idx;
	
	form.appendChild(idxInput);
	
	// body영역의 form객체를 자식으로 추가
	document.body.appendChild(form);
	
	form.submit();
	
	// 2. jQuery 코드를 이용해서 <form>만들기
	// form 태그를 넣으면서 attribute를 지정해준다
	// object로 넣어주면 여러개 넣을 수 있다
	// 이 방식을 많이 쓴다
	var $form = $("<form>").attr({
		action: "/member/delete.do"
		, method: "post"
	});
	var $input = $("<input>").attr({
		type: "hidden"
		, name: "idx"
		, value: idx
	});
	
// 	$form.append( $input );
// 	$(document.body).append( $form );
	$form.append($input)
	.appendTo($(document.body));
	
	$form.submit();
	
	// 2-1.jQuery 변형
	// 가독성이 좋진 않다
	var $form = null;
	$(document.body).append(
		$form = $("<form>").attr({
			action: "/member/delete.do"
			, method: "post"
		}).append(
			$("<input>").attr({
				type: "hidden"
				, name: "idx"
				, value: idx
			})		
		)	
	);
// 	$form.submit();
}

function updateAct(idx){
	console.log("updateAct("+idx+") called");
	
	var $form2 = $("<form>").attr({action:"/member/update.do",method:"post"});
	var $input = $("<input>").attr({type:"hidden", name:"idx", value:idx});
	
	$form2.append($input);
	$(document.body).append($form2);
	//한줄에 쓰기
	//$form2.append( $input ).appendTo( $(document.body) );
	
	$form.submit();
	
}

</script>


</head>
<body>

<div>

<h1>멤버 메인</h1>
<hr>

<form action="/member/insert.do" method="post">
<table border="1">
<tr>
<thead>
<tr>
	<th>이름</th>
	<th>이메일</th>
	<th>전화번호</th>
	<th></th>
</tr>
</thead>
<tbody>
<tr>
	<td><input type="text" name="name" id="name" /></td>
	<td><input type="text" name="email" id="email" /></td>
	<td><input type="text" name="phone" id="phone" /></td>
	<td><input type="submit" value="가입"></td>
</tr>
</tbody>
</table>
</form>

<c:if test="${list.size() eq 0 }">
	<h3>데이터가 없습니다.</h3>
</c:if>

<c:if test="${list.size() ne 0 }">
<table border="1">
<thead>
<tr>
	<th>번호</th>
	<th>이름</th>
	<th>이메일</th>
	<th>전화번호</th>
	<th>가입날짜</th>
</tr>
</thead>
<tbody>
<c:forEach items="${list }" var="data">
<tr>
	<td>${data.idx }</td>
	<td>${data.name }</td>
	<td>${data.email }</td>
	<td>${data.phone }</td>
<%-- 	<td>${data.joinDate }</td> --%>
<%-- 	<td>${data.join_date }</td> --%>
	<td>
		<fmt:formatDate value="${data.joinDate }"	pattern="yyyy-MM-dd" />
	</td>
	<td>
		<button>수정</button>
		<button onclick="deleteAct(${data.idx });">삭제</button>
	</td>
</tr>
</c:forEach>
</tbody>
</table>
</c:if>
</div>

</body>
</html>

