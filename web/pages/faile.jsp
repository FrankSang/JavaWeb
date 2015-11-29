<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 11/29/15
  Time: 1:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录失败</title>
</head>
<body>
登录失败.<br/>
你提交的信息是:<br/>
UserName:<%= request.getParameter("uname") %> <br/>
PassWord:<%= request.getParameter("upwd") %> <br/>
msg:<%= request.getAttribute("msg")%> <br/>
<a href="<%= request.getContextPath()%>/pages/Login.jsp">返回登录界面</a><br/>
</body>
</html>
