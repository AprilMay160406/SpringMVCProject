<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="viewphoto" method="post" modelAttribute="Photo" enctype="multipart/form-data">
<form:input path="file" type="file" name="img"/>
<input type="submit">
</form:form>
</body>
</html>