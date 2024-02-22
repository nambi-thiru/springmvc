<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Register User</h1>

<form:form action="save" modelAttribute= "user">
User Name : <form:input path="userName"/><br>
User Contact : <form:input path="userCntct"/><br>
User Mail : <form:input path="userMail"/><br>
User Password : <form:input path="userPwd"/><br>
<input type="submit">
</form:form>

</body>
</html>