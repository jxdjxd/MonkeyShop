<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html lang="zh-CH">

<head>
    <meta charset="UTF-8"/>
    <title>后台管理</title>
    <base href="http://localhost:8080/MonkeyShop/"/>
	<link rel="stylesheet" type="text/css" href="manage/css/admin_login.css"/>
    <script type="text/javascript" src="manage/js/jquery.min.js"></script> 
    <script type="text/javascript" src="manage/js/admin_login.js"></script>
</head>

<body>
    <div id="loginDiv">
        <form id="form">
            <h1 style="text-align: center;color: aliceblue;">登陆</h1>
            <p>用户名:<input id="userName" name="userNname" type="text" required="required" placeholder="6-10个字符"><label id="name_trip"></label></p>
            <p>密&nbsp;&nbsp;码: <input id="password" name="password" type="password" required="required" placeholder="6-10个字符"><label id="password_trip"></label></p>

            <div style="text-align: center;margin-top: 30px;">
                <input id="submit" type="submit" class="button" onclick="   " value="登陆">
                <input type="reset" class="button" value="重置">
            </div>
        </form>
    </div>


</body>

</html>