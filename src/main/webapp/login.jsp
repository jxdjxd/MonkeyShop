<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <base href="http://localhost:8080/MonkeyShop/"/>
    <title>用户登录</title>
    <link rel="stylesheet" type="text/css" href="css/login.css"/>
</head>
<body><!-------------------login-------------------------->
<div class="login">
    <form action="UserServlet?method=User_login" method="post">
    <h1><a href="index.html"><img src="img/temp/logo.png"></a></h1>
        <div class="msg-warn hide">
        <b></b>
        <%-- <% String str = (String)request.getAttribute("message"); %> --%>
        <%-- <%= str==null ? "公共场所不建议自动登录，以防账号丢失":str%> --%>
        ${message==null?"公共场所不建议自动登录，以防账号丢失":message}
        </div>
        <p>
        <input type="text" name="us_name" placeholder="用户名 6-10个字符" required="required" 
            <%-- <%String userName = request.getParameter("us_name"); %> --%>
            <%-- value="<%= userName==null ? "": userName %>" --%>
            value="${param.us_name}"
        />
        </p>  
        <p><input type="password" name="us_password" placeholder="密码 6-10个字符" required="required"></p>
        <p><input type="submit" value="登  录"></p>
        <p class="txt"><a class="" href="reg.jsp">免费注册</a><a href="forget.html">忘记密码？</a></p>
        <P></P>
    </form>
</div>
</body>
</html> 