<%--
  Created by IntelliJ IDEA.
  User: 44748
  Date: 2021/8/1
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script>
        $(function (){
            $('#btn').on('click',function (){
                $.post('${pageContext.request.contextPath}/ajax/getUsers',function (data){
                    console.log(data)
                })
            })
        })
    </script>
</head>
<body>
    <button id="btn">发送AJAX请求</button>
</body>
</html>
