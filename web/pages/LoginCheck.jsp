<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 11/29/15
  Time: 4:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>登录校验</title>
<style type="text/css">
body{
    color:#000;
    font-size:14px;
    margin:20px auto;
}
</style>
    <script type="text/javascript">
        function check(form){
            if(document.forms.loginform.uname.value==""){
                alert("请输入用户名！");
                document.forms.loginform.uname.focus();
                return false;
            }
            if(document.forms.loginform.upwd.value==""){
                alert("请输入密码！");
                document.forms.loginform.upwd.focus();
                return false;
            }
        }
    </script>
</head>
<body>
<form action="<%= request.getContextPath()%>/CheckServlet" method="post" name="loginform">
    <table border="1" cellspacing="0" cellpadding="5" align="center" >
<tr>
    <td colspan="2" align="center" bgcolor="#E8E8E8">用户登录</td>
</tr>
        <tr>
            <td>用户名:</td>
            <td><input type="text" name="uname"/></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input type="password" name="upwd"/></td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" name="submit" onclick="return check(this);" />
                <input type="reset" name="ReSet" />
            </td>
        </tr>
    </table>
</form>
</body>
</html>
