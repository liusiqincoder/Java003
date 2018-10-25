<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/25
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>page4</title>
</head>
<body>
账户：<%=session.getAttribute("zhanghu")%>
姓名：<%=request.getParameter("name")%><br>
密码：<%=session.getAttribute("password")%>
</body>
</html>
