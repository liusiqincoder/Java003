<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/16
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=gb2312" %>
<html><head><title>Out Example</title></head>
<body>
<h2>out对象的使用</h2>
<%
    out.print("学习使用out对象");
    int buffer = out.getBufferSize();
    int available = out.getRemaining();
%>
<br>
out对象的类型为：<%= out.getClass().getName() %><br>
BufferSize=<%= buffer %><br>
Available=<%= available %>
</body></html>
