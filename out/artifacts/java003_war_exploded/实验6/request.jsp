<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/16
  Time: 14:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=gb2312" %>
<%
    String remoteAddr = request.getRemoteAddr();
    String remoteHost = request.getRemoteHost();
    int serverPort = request.getServerPort();
%>
<html>
<body>
���IP��ַΪ��<%=remoteAddr %><br>
���������Ϊ��<%=remoteHost %><br>
�������Ķ˿ں�Ϊ��<%=serverPort %><br>
</body>
</html>
