<%--
  Created by IntelliJ IDEA.
  User: wenzailong
  Date: 2017/6/30
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<link href="${pageContext.request.contextPath }/css/base.css" rel="stylesheet" type="text/css" />

<frameset rows="88,*" cols="*" frameborder="no" border="0" framespacing="0">
    <frame src="${pageContext.request.contextPath }/home/top" name="topFrame" scrolling="No" noresize="noresize" id="topFrame" title="topFrame" />
    <frameset cols="220,*" frameborder="no" border="0" framespacing="0">
        <frame src="${pageContext.request.contextPath }//home/left" name="leftFrame" scrolling="No" noresize="noresize" id="leftFrame" title="leftFrame" />
        <frame src="${pageContext.request.contextPath }/home/index" name="rightFrame" id="rightFrame" title="rightFrame" />
                        <%--这种跳转方法是get--%>
    </frameset>
</frameset>
<noframes><body>
</body></noframes>
</html>
