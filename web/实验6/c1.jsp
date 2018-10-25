<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/10/22
  Time: 19:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>猜测随机数</title>
    <style>
        li{
            display: block;
            float: left;
            padding:50px;
            margin: 50px;
        }
        li:hover{
            background: cadetblue;
        }
    </style>
</head>
<body>
<form method="post" action="guess.jsp">
<ul>请猜测数字：<br>

    <li style="list-style-type:none;"><input type="submit" name="num" value="0"></li>
    <li style="list-style-type:none;"><input type="submit" name="num" value="1"></li>
    <li style="list-style-type:none;"><input type="submit" name="num" value="2"></li>
    <li style="list-style-type:none;"><input type="submit" name="num" value="3"></li>
    <li style="list-style-type:none;"><input type="submit" name="num" value="4"></li><br>
    <li style="list-style-type:none;"><input type="submit" name="num" value="5"></li>
    <li style="list-style-type:none;"><input type="submit" name="num" value="6"></li>
    <li style="list-style-type:none;"><input type="submit" name="num" value="7"></li>
    <li style="list-style-type:none;"><input type="submit" name="num" value="8"></li>
    <li style="list-style-type:none;"><input type="submit" name="num" value="9"></li>

</ul>

</form>
</body>
</html>
