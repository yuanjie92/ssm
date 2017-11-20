<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>edit</title>
</head>
<body>
	<h1>edit student</h1>
	<form action="udpateStudentById" method="post">
		<input name="id" type="hidden" value="${stuData.id }"/>
		name:<input name="name" type="text" value="${stuData.name }" /><br>
		class:<input name="clazz" type="text" value="${stuData.clazz }" /><br>
		birthday:<input name="birthday" type="text" value="${stuData.birthday }"/><br>
		<input type="submit" value="修改" />
	</form>
</body>
</html>