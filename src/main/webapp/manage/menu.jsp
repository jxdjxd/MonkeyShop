<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8"/>
    <title>简单通用文章系统后台管理模板</title>
    <base href="http://localhost:8080/MonkeyShop/"/>
    <link rel="stylesheet" type="text/css" href="manage/css/common.css"/>
    <link rel="stylesheet" type="text/css" href="manage/css/main.css"/>
</head>
<body>
<div class="topbar-wrap white">
    <div class="topbar-inner clearfix">
        <div class="topbar-logo-wrap clearfix">
            <h1 class="topbar-logo none"><a href="manage/admin_index.jsp" class="navbar-brand">后台管理</a></h1>
            <ul class="navbar-list clearfix">
                <li><a class="on" href="manage/admin_index.jsp">后台首页</a></li>
                <li><a href="index.html">网站首页</a></li>
                <li><img src="img/logo.png" width="100px" height="50px"/></li>
            </ul>
        </div>
        <div class="top-info-wrap">
            <ul class="top-info-list clearfix">
                <li><a href="#">管理员</a></li>
                <li><a href="#">修改密码</a></li>
                <li><a href="#">退出</a></li>
            </ul>
        </div>
    </div>
</div>
<div class="container clearfix">
    <div class="sidebar-wrap">
        <div class="sidebar-title">
            <h1>菜单</h1>
        </div>
        <div class="sidebar-content">
            <ul class="sidebar-list">
                <li>
                    <a href="#"><i class="icon-font">&#xe003;</i>常用操作</a>
                    <ul class="sub-menu">
                        <li><a href="Manage/ProduceServlet?method=getAllProduce"><i class="icon-font">&#xe008;</i>商品管理</a></li>
                        <li><a href="admin_design.jsp"><i class="icon-font">&#xe005;</i>用户管理</a></li>
                        <li><a href="admin_design.jsp"><i class="icon-font">&#xe012;</i>评论管理</a></li>
                        <li><a href="admin_design.jsp"><i class="icon-font">&#xe006;</i>分类管理</a></li>
                        <li><a href="admin_design.jsp"><i class="icon-font">&#xe004;</i>留言管理</a></li>
                        <li><a href="admin_design.jsp"><i class="icon-font">&#xe052;</i>友情链接</a></li>
                        
                    </ul>
                </li>
                <li>
                    <a href="#"><i class="icon-font">&#xe018;</i>系统管理</a>
                    <ul class="sub-menu">
                        <li><a href="admin_system.jsp"><i class="icon-font">&#xe017;</i>系统设置</a></li>
                        <li><a href="admin_system.jsp"><i class="icon-font">&#xe037;</i>清理缓存</a></li>
                        <li><a href="admin_system.jsp"><i class="icon-font">&#xe046;</i>数据备份</a></li>
                        <li><a href="admin_system.jsp"><i class="icon-font">&#xe045;</i>数据还原</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>