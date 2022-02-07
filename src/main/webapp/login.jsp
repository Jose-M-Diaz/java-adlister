<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title><%= "Welcome" %></title>
</head>

<body>
<h1>LOGIN</h1>

<form action="/login.jsp" method="post">
    <label for="username">Username:</label>
    <input id="username" name="username" placeholder="Enter Username">
    <label for="password">Password:</label>
    <input id="password" name="password" placeholder="Enter Password">
    <input type="submit">
</form>

<c:choose>
    <c:when test="${param.username.equals('admin') && param.password.equals('password')}">
        <c:redirect url="profile.jsp"/>
    </c:when>
</c:choose>

</body>
</html>