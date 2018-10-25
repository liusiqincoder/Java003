<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/16
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登陆</title>
</head>
<body>
<form action="/实验6/doSomething.jsp">
用户名：<input type="text" name="name" value=""/><br><br>
密码：<input type="password" name="password" value=""/>${requestScope.message}<br><br>
<input type="submit" value="登陆"/>
</form>
</body>
</html>
