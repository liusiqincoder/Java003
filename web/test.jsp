<%@ page import="com.dao.enterties.User" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/22
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="test" uri="/test" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>test</title>
</head>
<body>
<%
    out.println("ok");
    int[][] nums = {{1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}};
    request.setAttribute("nums", nums);
    String str = "name";
    User user = new User("张三", "1234");
    request.setAttribute("str", str);
%>
<c:out value="test<jsp:include>&"></c:out>
<c:forEach items="${nums}" var="num">${num[0]}&nbsp${num[1]}&nbsp${num[2]}&nbsp${num[3]}
    <c:if test="${num[3]>10}">(grater than 10)</c:if>
    <c:choose>
        <c:when test="${num[3]%2==0}">(是偶数)</c:when>
        <c:when test="${num[3]%2==1}">(是奇数)</c:when>
        <c:otherwise>NAN</c:otherwise>
    </c:choose>
</c:forEach>
<br>
<c:set var="str" value="${null}"></c:set>
str:<%=request.getAttribute("str")%><br>
str:<c:out value="${str}"></c:out><br>
<%--<c:import url="http://www.baidu.com" var="baidu"></c:import>
<c:import url="http://www.baidu.com"></c:import>--%>
<c:url value="http://localhost:8080//购物车系统/com.dao.service/lopgin.jsp">
    <c:param name="name" value="路人甲"/>
    <c:param name="password" value="1234"/>
</c:url><br>
<test:ExampleTag>adhagysa</test:ExampleTag>
<test:ExampleTag align="right">adas</test:ExampleTag>
<test:ExampleTag fontSize="30">我是标签体</test:ExampleTag>
</body>
</html>
