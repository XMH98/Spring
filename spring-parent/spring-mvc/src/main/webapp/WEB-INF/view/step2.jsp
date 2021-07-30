<%--
  Created by IntelliJ IDEA.
  User: 44748
  Date: 2021/7/30
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户注册</title>
</head>
<body>
    <h2>注册</h2>
    <form action="${pageContext.request.contextPath}/session/step3" method="post">
        手机号：<input type="text" name="phone"> <br>
        邮箱：<input type="text" name="email"> <br>
        <input type="submit" value="下一步">
    </form>

</body>
</html>
