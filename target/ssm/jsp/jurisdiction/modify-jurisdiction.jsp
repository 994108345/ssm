<%@ page import="com.mb.wzl.entity.PageBean" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>修改权限</title>
</head>
<link href="${pageContext.request.contextPath}/css/base.css" rel="stylesheet" type="text/css"/>
<body>
<div class="div-back-lastPage">
    <a class="a-back-lastPage" onclick="location.href='javascript:history.go(-1);'">退一页</a>
</div>
    <h1>修改权限</h1>
    <%
        PageBean pageBean=(PageBean)request.getSession().getAttribute("pageBean");
        int currentPage=pageBean.getCurrentPage();
        int begin=(currentPage-1)*10+1;
        int allPageNum=pageBean.getAllPageNum();
    %>
    <form action="${pageContext.request.contextPath}/jurisdiction/getCurrentCount" method="post">
        <table>
            <tr>
                <td>编号</td>
                <td>角色名</td>
                <td>操作</td>
                <td>备注</td>
            </tr>
        <c:forEach items="${sessionScope.pageBean.list}" var="role">
            <tr>
                <td><%=begin%></td>
                <td>${role.roleName}</td>
                <td><a href="">查看</a>/
                    <a href="">修改</a>/
                    <a href="">删除</a></td>

                <td></td>
            </tr>
            <% begin++;%>
        </c:forEach>
            <tr>
                <td>总共${pageBean.allPageNum}页</td>
                <td>总共${pageBean.allCountNum}条数据</td>
                <td>这是第${pageBean.currentPage}页</td>
            </tr>
            <tr>
        <c:if test="${pageBean.currentPage == 1}">
            <td><a href="${pageContext.request.contextPath}/jurisdiction/getCurrentCount?currentPage=<%=currentPage+1%>">下一页</a></td>
            <td><a href="${pageContext.request.contextPath}/jurisdiction/getCurrentCount?currentPage=<%=allPageNum%>">尾页</a></td>
        </c:if>
        <c:if test="${pageBean.currentPage == pageBean.allPageNum}">
            <td><a href="${pageContext.request.contextPath}/jurisdiction/getCurrentCount?currentPage=1">首页</a></td>
            <td><a href="${pageContext.request.contextPath}/jurisdiction/getCurrentCount?currentPage=<%=currentPage-1%>">上一页</a></td>
        </c:if>
        <c:if test="${pageBean.currentPage > 1 && pageBean.currentPage<pageBean.allPageNum}">
            <td><a href="${pageContext.request.contextPath}/jurisdiction/getCurrentCount?currentPage=1">首页</a></td>
            <td><a href="${pageContext.request.contextPath}/jurisdiction/getCurrentCount?currentPage=<%=currentPage-1%>">上一页</a></td>
            <td><a href="${pageContext.request.contextPath}/jurisdiction/getCurrentCount?currentPage=<%=currentPage+1%>">下一页</a></td>
            <td><a href="${pageContext.request.contextPath}/jurisdiction/getCurrentCount?currentPage=<%=allPageNum%>">尾页</a></td>
        </c:if>
            </tr>
            <tr>
                <td>跳转第</td>
                <td><input type="text" name="currentPage" id="modifyJurisdiction-submit"  size="10"/></td>
                <td>页</td>
                <td><input type="submit" value="提交" onclick="return checkNum()"/></td>
            </tr>
        </table>
    </form>

</body>
</html>
