<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/9
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${name}用户的信息</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");
%>
用户名:${param.name}<br>
用户密码:${param.password}<br>
真实姓名:${param.realName}<br>
性别:${param.sex}<br>
出生日期：${param.year}年${month}月${day}日<br>
电子邮件:${param.email}<br>
联系电话:${param.phone}<br>
联系地址:${param.address}
</body>
</html>
