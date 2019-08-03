<%--
  Created by IntelliJ IDEA.
  User: 马果
  Date: 2019/7/26
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://shiro.apache.org/tags" prefix="shiro" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <h1>用户管理主界面</h1>
        <shiro:hasPermission name="user:add">
            <a href="#">增加用户</a><Br>
        </shiro:hasPermission>


        <shiro:hasPermission name="user:del">
            <a href="#">删除用户</a><Br>
        </shiro:hasPermission>


        <shiro:hasPermission name="user:update">
            <a href="#">修改用户</a><Br>
        </shiro:hasPermission>



        <shiro:hasPermission name="user:select">
            <a href="#">查询用户</a><Br>
        </shiro:hasPermission>

</body>
</html>