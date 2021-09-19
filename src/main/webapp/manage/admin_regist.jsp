<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html lang="en">

<head>
    <meta http-equiv="Content-Type" content="register/html; charset=UTF-8">
    <title>注册管理员</title>
    <base href="http://localhost:8080/MonkeyShop/"/>
    <link rel="stylesheet" type="text/css" href="manage/css/admin_regist.css"/>
    <!--表单验证-->
    <script type="text/javascript" src="manage/js/jquery.min.js"></script>
    <script type="text/javascript" src="manage/js/admin_regist.js"></script>
</head>

<body>
    <div id="loginDiv">
        <form action="Manage_loginServlet">
            <h1>注册管理员</h1>
            <p>用户姓名:<input id="userName" type="text" autofocus required><label id="name_trip"></label></p>

            <p>用户密码:<input id="password" type="password" required><label id="password_trip"></label></p>

            <p>确认密码:<input id="surePassword" type="password" required><label id="surePassword_trip"></label></p>
            <p style="text-align: center;">
                <input id="submit" type="submit" class="button" value="提交">
                <input type="reset" class="button" value="重置">
            </p>
        </form>
    </div>

</body>
</html>