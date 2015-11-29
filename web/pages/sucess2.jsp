<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 11/29/15
  Time: 1:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功</title>
    <style type="text/css">
        body{
            color:#000;
            font-size:14px;
            margin:20px auto;
        }
        #message {
            text-align:center;        }
    </style>
</head>
<body>
<div id="message">
   登录成功. <br/>
    <%
    Object obj=request.getAttribute("msg");
        if(obj!=null)
            out.println(obj.toString());
        else
            out.println("没有返回值");
    %>
    <br>
   你提交的信息是:<br/>
   UserName:<%= request.getParameter("uname") %> <br/>
   PassWord:<%= request.getParameter("upwd") %> <br/>
   <a href="<%=request.getContextPath()%>/pages/LoginCheck.jsp">返回登录界面</a><br/>
</div>
</body>
</html>
