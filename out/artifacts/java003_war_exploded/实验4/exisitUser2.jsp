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
    String name = request.getParameter("zhanghu");
    String password = request.getParameter("password");
    if (name.equals(password)) {
        session.setAttribute("zhanghu", name);
        session.setAttribute("password", password);
%>
<jsp:forward page="/实验4/page3.jsp"></jsp:forward>
<%
    }
%>
</body>
</html>
