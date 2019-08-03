<%--
  Created by IntelliJ IDEA.
  User: 马果
  Date: 2019/7/25
  Time: 9:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page  isELIgnored="false"  contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body>
        <h1>用户登录</h1>

        <form action="/login" method="post">
            姓名：<input type="text" name="username"/><Br>
            密码：<input type="password" name="password"/><Br>
                <input type="submit" value="登录"/>
        </form>
</body>
</html>
