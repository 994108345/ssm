
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<link href="${pageContext.request.contextPath }/css/base.css" rel="stylesheet" type="text/css" />

<body id="top-body">
   <table id="top-table-title">
       <tr id="top-tr-title">
           <td id="top-td-left"><h1>NuLiDeXiaoMa</h1></td>
           <td id="top-td-right">
               <div>用户名：${user.name}&nbsp&nbsp
                   <a href="${pageContext.request.contextPath}/jsp/user/login.jsp" target="_top">注销</a>&nbsp
                   <a href="${pageContext.request.contextPath}/jsp/base/exit.jsp" target="_top">退出</a>
               </div>
           </td>
       </tr>
   </table>
</body>
</html>
