<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/22
  Time: 19:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%!
    int num= (int) (Math.random()*10);
    int time;
    String guess(HttpServletRequest request,HttpSession session){
        if (session.getAttribute("time") == null) {
            session.setAttribute("time", 1);
            time = 1;
        } else {
            time = (Integer) session.getAttribute("time")+1;
            session.setAttribute("time", time);
        }

        int guessNum = Integer.valueOf(request.getParameter("num"));
        if (guessNum > num) {
            return "你猜大了" + "这是你第" + time + "次猜测"+num;
        } else if (guessNum < num) {
            return "你猜小了" + "这是你第" + time + "次猜测"+num;
        } else {
            return "你猜对了" + "这是你第" + time + "次猜测"+num;
        }
    }
%>
<html>
<head>
    <title>猜测结果</title>
</head>
<body>
<h1><%=guess(request,session)%></h1>
<a href="c1.jsp">重新猜测</a>
</body>
</html>
