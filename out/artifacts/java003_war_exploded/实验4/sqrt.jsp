<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/25
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${param.num}的平方</title>
</head>
<body>
<%
    int num = Integer.valueOf(request.getParameter("num"));
%>
<%=request.getParameter("num")%>!=<%=num * num%>
</body>
</html>