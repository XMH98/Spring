<%--
  Created by IntelliJ IDEA.
  User: 44748
  Date: 2021/7/28
  Time: 22:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <script src="${pageContext.request.contextPath}/js/hello.js"></script>
</head>
<body>
    <h2>登录</h2>
    <span style="color: #ff0000">${loginError}</span>
    <form action="${pageContext.request.contextPath}/param/test9" method="post">
        用户名：<input type="text" name="username">
        密码：<input type="password" name="password">
        <input type="submit" value="登录">
    </form>

    <img src="${pageContext.request.contextPath}/img/1.JPG">
</body>
</html>
