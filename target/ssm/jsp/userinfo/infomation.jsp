<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>user-information</title>
    <%--导入弹出框需要的css样式--%>
    <link href="${pageContext.request.contextPath}/pop-box/css/material-modal.css" rel="stylesheet" type="text/css"/>
    <%--导入基础的css样式--%>
    <link href="${pageContext.request.contextPath}/css/base.css" rel="stylesheet" type="text/css"/>
    <%--导入弹出框需要的js文件--%>
    <script type="text/javascript" src="${pageContext.request.contextPath}/pop-box/js/material-modal.js"></script>

</head>
<body>
<div id="infomation">
    <div class="div-back-lastPage">
        <a class="a-back-lastPage" onclick="location.href='javascript:history.go(-1);'">退一页</a>
    </div>
    <h1>个人信息</h1>
    <form>
        <table id="infomation-table">
            <tr>
                <td>用户名：</td>
                <td><input type="text" name="username" value="${user.userName}"/></td>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <td>真实姓名：</td>
                <td><input type="text" name="name" value="${user.name}"/></td>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <td>年龄</td>
                <td><input type="text" name="year" value="${user.year}"/></td>
                <td></td>
                <td></td>
            </tr>
            <tr>
                <td><input type="button" value="保存"
                           onclick="materialConfirm('确认框','确定要保存吗',function(result){console.log(result)})"/></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
        </table>
    </form>

<%--弹出框--%>
    <div id="materialModal" onclick="closeMaterialAlert(event, false)" class="hide">
        <div id="materialModalCentered">
            <div id="materialModalContent" onclick="event.stopPropagation()">
                <div id="materialModalTitle">
                    确认框
                </div>
                <div id="materialModalText">
                    确定要保存吗<br/>
                </div>
                <div id="materialModalButtons">
                    <div id="materialModalButtonOK" class="materialModalButton" onclick="closeMaterialAlert(event, true)">
                        确定
                    </div>
                    <div id="materialModalButtonCANCEL" class="materialModalButton" onclick="closeMaterialAlert(event, false)">
                        取消
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>

</html>
