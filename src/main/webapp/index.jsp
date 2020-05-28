<%--
  Created by IntelliJ IDEA.
  User: xuhuanjiang
  Date: 2020/5/18
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
</head>
<body>
    <a href="account/findAll">查询所有</a>

    <hr>
    <h2>保存用户</h2>
    <form action="account/save" method="post">
        用户名称：<input type="text" name="name"><br>
        用户余额：<input type="text" name="money"><br>
        <input type="submit" value="保存">
    </form>


</body>
</html>
