<%--
  Created by IntelliJ IDEA.
  User: 44748
  Date: 2021/8/2
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--    <form action="${pageContext.request.contextPath}/file/upload" method="post" enctype="multipart/form-data">--%>
<%--        用戶名：<input type="text" name="username"> <br>--%>
<%--        文件：<input type="file" name="file"> <br>--%>
<%--        <input type="submit" value="上傳">--%>
<%--    </form>--%>

    <form action="${pageContext.request.contextPath}/file/uploads" method="post" enctype="multipart/form-data">
        用戶名：<input type="text" name="username"> <br>
        文件：<input type="file" name="files">
            <input type="file" name="files">
            <input type="file" name="files"><br>
        <input type="submit" value="上傳">
    </form>

    <a href="${pageContext.request.contextPath}/file/download?filename=hmbb.JPG">下载文件：使用请求参数传递文件</a>
    <a href="${pageContext.request.contextPath}/file/download?filename=hmbb.JPG">下载文件：使用rest风格传递文件</a>
</body>
</html>
