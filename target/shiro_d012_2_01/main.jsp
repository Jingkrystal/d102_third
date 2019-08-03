<%--
  Created by IntelliJ IDEA.
  User: 马果
  Date: 2019/7/25
  Time: 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>

    <title>Title</title>
    <style type="text/css">
        table,th,tr,td{
            border: 1px black solid;
            border-collapse: collapse;
        }
    </style>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css">
</head>
<body STYLE="margin: 0px;">
    <table width="100%" height="100%">
        <Tr height="120px">
            <Td colspan="2">
                用户名[<B style="color: red">${user}</b>]
                <a href="logout">退出</a>
            </Td>
        </Tr>
        <Tr>
            <Td width="20%" valign="top" align="center">
                <c:forEach items="${menus}" var="m">
                    <a href="${m.url}">${m.NAME}</a><Br>
                </c:forEach>
            </Td>
            <Td>右侧</Td>
        </Tr>
    </table>
</body>
</html>
