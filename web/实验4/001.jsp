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
    <title>001</title>
</head>
<body>
<%!
    int fn(int n) {
        int res = 1;
        while (n != 1) {
            res *= n;
            n--;
        }
        return res;
    }
%>
10!=<%=fn(10)%>
</body>
</html>
