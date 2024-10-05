<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${PhotoBean.id}
<img src="data:image/jpeg;base64,${PhotoBean.getBase64()}" alt="Image from database"/>
</body>
</html>