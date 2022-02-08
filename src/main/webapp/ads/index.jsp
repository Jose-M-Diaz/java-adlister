<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: jose
  Date: 2/7/22
  Time: 3:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show All Ads</title>
</head>
<body>
<h1>Here are all the ads</h1>
<c:forEach var="ad" items="${ads}">
    <div class="ad">
        <h2>${ad.title}</h2>
        <h4>${ad.description}</h4>
        <p>User ID: ${ad.userId}</p>
    </div>
</c:forEach>
</body>
</html>
