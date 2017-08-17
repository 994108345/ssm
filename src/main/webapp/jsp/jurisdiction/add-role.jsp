<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath }/js/jquery-1.8.3.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath }/js/base.js" type="text/javascript"></script>
    <link href="${pageContext.request.contextPath}/css/base.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="div-back-lastPage">
    <a class="a-back-lastPage" onclick="location.href='javascript:history.go(-1);'">退一页</a>
</div>
    <h1>添加角色</h1>
    <form action="${pageContext.request.contextPath}/jurisdiction/addRole" method="post">
    <table>
        <tr>
            <td>角色名：<input type="text" id="addRole-roleName" name="roleName" /></td>
            <td><p id="addRole-errorMessage"></p></td>
            <td></td>
        </tr>
        <tr>
            <td>选择权限:</td>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <td><input type="checkbox" name="user" id="addRole-user"/>用户信息管理</td>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <td><input type="checkbox" name="log" id="addRole-log"/>日志信息管理</td>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <td><input type="checkbox" name="account" id="addRole-account"/>账号管理</td>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <td><input type="checkbox" name="jurisdiction" id="addRole-jurisdiction"/>权限管理</td>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <td><input type="submit" onclick="return checkAddRole()" value="确定添加"/></td>
            <td><p id="addRole-errorMessage2" class="p-message"></td>
            <td></td>
        </tr>
    </table>
    </form>
</body>
</html>
