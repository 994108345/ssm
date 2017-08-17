<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
  <head>
   <title>努力的小码登录界面</title>
    <base href="<%=basePath%>">
	<%--<link href="${pageContext.request.contextPath }/css/style.css" rel="stylesheet" type="text/css" />
	<script src="${pageContext.request.contextPath }/js/cloud.js" type="text/javascript"></script>--%>
</head>
<body>
    <form action="/wssm/user/login" method="post">
        <table>
            <tr>
                <td>用户名</td>
                <td><input type="text" name="username" /></td>
                <td></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="text" name="password" /></td>
                <td></td>
            </tr>
            <tr>
                <td><input type="submit" value="提交" /></td>
                <td>${login}</td>
                <td></td>
            </tr>
        </table>
    </form>
</body>


