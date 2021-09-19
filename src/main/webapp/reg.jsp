<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <base href="http://localhost:8080/MonkeyShop/"/>
    <title>注册</title>
    <link rel="stylesheet" type="text/css" href="css/public.css"/>
    <link rel="stylesheet" type="text/css" href="css/reg.css"/>
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/user_reg.js"></script>
</head>
<body>
<div class="reg">
    <form action="UserServlet?method=User_regist" method="post">
        <h1><a href="index.html"><img src="img/temp/logo.png"></a></h1>
        <p>用户注册</p>
        <p>用户名：<input type="text" id="userName" name="us_name"  placeholder="6-10个字符" required="required"></p>
        <p>邮箱：<input type="text" id="email" name="us_email"  placeholder="请输入邮箱" required="required"></p>
        <p>密码：<input type="password" id="password" name="us_password"  placeholder="6-10个字符" required="required"></p>
        <p>确认密码：<input type="password" id="surePassword" name="surePassword"  placeholder="请确认密码" required="required"></p>
        <p class="txtL txt">
            验证码：<input class="code" type="text" id="VarCode" name="code" placeholder="验证码" required="required">
                   <img src="getCode" id="codeImg" alt="验证码图片">
        </p>
        <p><input id="submit" type="submit" name="" value="注册"></p>
        <p class="txtL txt">完成此注册，即表明您同意了我们的<a href="#">使用条款和隐私策略</a></p>
        <p class="txt"><a href="login.jsp"><span></span>已有账号登录</a></p>
    </form>
</div>
<script>
    var Relcode = "${sessionScope.code}".toLowerCase();
</script>
</body>
</html>