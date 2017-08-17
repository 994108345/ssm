<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jquery-bloackUI学习测试界面</title>
    <script src="../../js/jquery-1.8.3.js" type="text/javascript"></script>
    <script src="jquery-blockUI-test.js" type="text/javascript"></script>
    <script src="../../js/jquery.blockUI.js" type="text/javascript"></script>
    <link href="${pageContext.request.contextPath}/css/base.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div class="div-back-lastPage">
    <a class="a-back-lastPage" onclick="location.href='javascript:history.go(-1);'">退一页</a>
</div>
    <button onclick="allPage()">遮罩所有</button>
    <button onclick="partOfPage()">遮罩部分</button>
    <button onclick="modifyMessage()">修改内容</button>
    <button onclick="modifyCss()">修改样式</button>
    <button onclick="modifyMessageAndCss()">修改文字加样式</button>
    <div id="div1">
        遮罩部分
    </div>

    <div id="div2">
        遮罩修改内容
    </div>
    <div id="div3">
        遮罩修改样式
    </div>
    <div id="div4">
        遮罩修改内容加样式
    </div>
</body>
</html>
