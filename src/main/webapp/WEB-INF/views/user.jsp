<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.error{
color: red
}</style>
</head>
<body>
<form:form modelAttribute="userObj" action="adduser" method="post">

Id :<form:input path="id"/>
<form:errors path="id" cssClass="error"></form:errors><br>

Age :<form:input path="age"/>
<form:errors path="age" cssClass="error"></form:errors><br>

Name :<form:input path="name"/>
<form:errors  path="name" cssClass="error"></form:errors><br>

Gender :
Male <form:radiobutton path="gender" value="Male"/>
Female <form:radiobutton path="gender" value="Female"/>
<br>
Frameworks :
<form:checkboxes items="${frameworks}" path="frameworks"/>
<br>

Numbers :
<form:radiobuttons path="number" items="${numList}"/>
<br>

Country:
${user.list}
<br>

<input type="submit" value="add">
</form:form>
</body>
</html>