<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 11/29/15
  Time: 12:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Login</title>
</head>
<body>
     <form action="<%=request.getContextPath()%>/CheckServlet" method="post">
         UserName:<input type="text" name="uname"/><br/>
         PassWord:<input type="password" name="upwd"/><br/>
         <input type="submit" name="Login"/>
         <input type="reset" name="Reset"/>
     </form>
</body>
</html>
