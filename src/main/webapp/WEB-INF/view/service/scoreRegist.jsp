<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="scoreForm" method="post">
	
		이름:<input type="text" name="name">
		국어:<input type="number" name="kor">
		수학:<input type="number" name="math">
		영어:<input type="number" name="eng">
		
		<input type="submit" value="점수등록">
	</form>


</body>
</html>