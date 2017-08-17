<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="${pageContext.request.contextPath }/css/base.css" rel="stylesheet" type="text/css" />

    <script src="${pageContext.request.contextPath }/js/jquery-1.8.3.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath }/js/base.js" type="text/javascript"></script>


</head>

<body id="left-body">
    <div id="menu">
        <ul id="left-ul-1menu">
            <li><a  class="a1">用户信息管理</a>
                <ul class="ul2">
                    <li><a  class="a2" href="${pageContext.request.contextPath}/jsp/userinfo/infomation.jsp" target="rightFrame">查看信息</a></li>
                    <li>${pageContext.request.contextPath}</li>
                    <li>示例</li>
                </ul>
            </li>
            <li><a class="a1">日志信息管理</a>
                <ul class="ul2">
                    <li>查看日志</li>
                    <li>示例</li>
                    <li>示例</li>
                </ul>
            </li>
            <li><a class="a1">账号管理</a>
                <ul class="ul2">
                    <li>查看账号</li>
                    <li>示例</li>
                    <li>示例</li>
                </ul>
            </li>
            <li><a class="a1">权限管理</a>
                <ul class="ul2">
                    <li><a class="a2" href="${pageContext.request.contextPath}/jsp/jurisdiction/add-role.jsp" target="rightFrame">添加角色</a></li>
                    <li><a class="a2" href="${pageContext.request.contextPath}/jurisdiction/getCurrentCount" target="rightFrame">修改角色权限</a></li>
                    <li>示例</li>
                </ul>
            </li>
            <li><a class="a1">遮罩学习</a>
                <ul class="ul2">
                    <li><a class="a2" href="${pageContext.request.contextPath}/jsp/blockUI/jquery-blockUI.jsp" target="rightFrame">遮罩页面示例</a></li>
                </ul>
            </li>
        </ul>
    </div>
</body>
</html>
