<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 44748
  Date: 2021/7/30
  Time: 13:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    name:${requestScope.name} <br>
    age:${age} <br>
    sex:${sex} <br>
    address:${address} <br>

    商品类型：
    <select name="" id="">
        <c:forEach items="${types}" var="type">
            <option value="">${type}</option>
        </c:forEach>
    </select>
</body>
</html>
