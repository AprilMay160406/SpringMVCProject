<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 ID : ${user.id}<br>
 Age :${user.age}<br>
 Name :${user.name}<br>
 Gender:${user.gender}<br>

Frameworks :${user.frameworks}"

<br>
<c:if test="${user.number == 1}">
Number 1
</c:if><br>

Country: ${user.country}
<br>

 

</body>
</html>