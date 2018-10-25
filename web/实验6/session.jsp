<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/16
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=gb2312" %>
<%@ page session="true" %>
<%
    session.setAttribute("user","欧阳清风");
%>

<html>
<body>
您的会话ID是：<%=session.getId()%><br>
session对象中存放的变量user的值为：<%=session.getAttribute("user")%>
</body>
</html>

