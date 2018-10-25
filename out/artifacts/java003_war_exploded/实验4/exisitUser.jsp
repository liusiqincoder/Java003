<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/25
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆状态</title>
</head>
<body>
<%
    String name = request.getParameter("name");
    String password = request.getParameter("password");
    if (name.equals(password)) {
%>
登陆成功
<%
} else {
%>
登陆失败
<%
    }
%>
</body>
</html>
