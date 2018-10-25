<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/16
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="src实验6.User,src实验6.userBank" %>
<html>
<%
    request.setCharacterEncoding("utf-8");
    response.setCharacterEncoding("utf-8");
    String name=request.getParameter("name");
    String password=request.getParameter("password");
    if(name==null||"".equals(name)){
        pageContext.setAttribute("message","请先登陆");
        response.sendRedirect("login.jsp");
        /*getRequestDispatcher使用绝对路径
        sendRedirect使用相对路径
        以上哪一种路径错了就会报错
        * */
    }else{
        User user=new User(name,password);
        if(!userBank.login(user)){
            request.setAttribute("message","密码错误");
            request.getRequestDispatcher("/实验6/login.jsp").forward(request,response);
        }
        else{
            pageContext.setAttribute("message",name+",欢迎你");
        }
    }
%>
<head>
    <title>${pageContext.getAttribute("message")}</title>
</head>
<body>
用户名：${param.name}<br>
密码：${param.password}
</body>
</html>
