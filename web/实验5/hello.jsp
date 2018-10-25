<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/9
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=gb2312" %>
<%@ page errorPage="errorHandler.jsp" %>
<html><body>
<%
    request.setCharacterEncoding("utf-8");
    String name = request.getParameter("name");
    if (name==null){
        throw new RuntimeException("没有指定name 属性。");
    }
    else{
        // 将字符串name的字符编码转换为汉字编码
        name = new String(name.getBytes("gb2312"),"gb2312");
    }
%>
Hello, <%=name %>
</body></html>
