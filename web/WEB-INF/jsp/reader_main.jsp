<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>主页</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.2.1.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js" ></script>
</head>
<body background="${pageContext.request.contextPath}/static/img/wolf.jpg" style=" background-repeat:no-repeat ;
background-size:100% 100%;
background-attachment: fixed;">
<div id="header">
    <nav class="navbar navbar-default" role="navigation" style="background-color:#fff">
        <div class="container-fluid">
            <div class="navbar-header" style="margin-left: 8%;margin-right: 1%">
                <a class="navbar-brand " href="reader_main"><p class="text-primary" style="font-family: 华文行楷; font-size: 200%; ">我的图书馆</p></a>
            </div>
            <div class="collapse navbar-collapse" id="example-navbar-collapse">
                <ul class="nav navbar-nav navbar-left">
                    <li >
                        <a href="reader_books">
                            图书查询
                        </a>
                    </li>
                    <li>
                        <a href="reader_info" >
                            个人信息
                        </a>
                    </li>
                    <li >
                        <a href="mylend" >
                            我的借还
                        </a>
                    </li>
                    <li >
                        <a href="reader_repasswd" >
                            密码修改
                        </a>
                    </li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="reader_info.html">${readercard.name}, 已登录</a></li>
                    <li><a href="logout">退出</a></li>
                </ul>
            </div>
        </div>
    </nav>
</div>
<h1 class="container">XXX图书馆欢迎您！！！O(∩_∩)O~</h1>
</body>
</html>
