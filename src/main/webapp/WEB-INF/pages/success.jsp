<%--
  Created by IntelliJ IDEA.
  User: xuhuanjiang
  Date: 2020/5/18
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>成功页面</title>
</head>
<body>
    <c:forEach items="${accounts}" var="account">
        <h2>${account.name}</h2>
        <h2>${account.money}</h2>
    </c:forEach>
</body>
</html>
