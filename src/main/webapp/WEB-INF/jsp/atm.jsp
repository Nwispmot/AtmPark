<%--
  Created by IntelliJ IDEA.
  User: radion
  Date: 18.12.2019
  Time: 22:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Банкомат</title>
</head>
<body>
<table border="1">
    <tr>
        <td>Id</td>
        <td>Баланс</td>
        <td>Время</td>
    </tr>
    <c:forEach var="in" items="${inf}">
        <tr>
            <td>${in.id}</td>
            <td>${in.balance}</td>
            <td>${in.time}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
