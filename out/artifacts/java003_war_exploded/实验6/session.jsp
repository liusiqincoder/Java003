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
    session.setAttribute("user","ŷ�����");
%>

<html>
<body>
���ĻỰID�ǣ�<%=session.getId()%><br>
session�����д�ŵı���user��ֵΪ��<%=session.getAttribute("user")%>
</body>
</html>

