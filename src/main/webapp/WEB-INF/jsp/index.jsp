<%--
  Created by IntelliJ IDEA.
  User: radion
  Date: 18.12.2019
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Список банкоматов</title>
</head>
<body>
    <table border="1">
        <tr>
            <td>Id банкомата</td>
            <td>Баланс</td>
            <td>Доступен?</td>
        </tr>
        <c:forEach var="arm" items="${all}">
            <tr>
                <td>${arm.id}</td>
                <td>${arm.account}</td>
                <td>${arm.isAvailable}</td>
                <td><a href="${arm.id}">info</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
