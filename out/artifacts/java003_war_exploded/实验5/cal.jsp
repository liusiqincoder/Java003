<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/9
  Time: 22:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>12319</title>
</head>
<body>
<%
    int width=Integer.valueOf(request.getParameter("width"));
    int height=Integer.valueOf(request.getParameter("height"));
%>
<h1>矩形的面积：<%=width*height%></h1>
</body>
</html>
