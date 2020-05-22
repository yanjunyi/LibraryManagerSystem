<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>${readercard.name}的主页</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.2.1.js"></script>
    <script src="${pageContext.request.contextPath}/static/js/bootstrap.min.js" ></script>
</head>
<body background="${pageContext.request.contextPath}/static/img/lizhi.jpg" style=" background-repeat:no-repeat ;
background-size:100% 100%;
background-attachment: fixed;">
<div id="header" style="padding-bottom: 80px">
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
                    <li class="active">
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
                    <li><a href="reader_info">${readercard.name}, 已登录</a></li>
                    <li><a href="logout">退出</a></li>
                </ul>
            </div>
        </div>
    </nav>
</div>
<c:if test="${!empty succ}">
    <div class="alert alert-success alert-dismissable">
        <button type="button" class="close" data-dismiss="alert"
                aria-hidden="true">
            &times;
        </button>
            ${succ}
    </div>
</c:if>
<c:if test="${!empty error}">
    <div class="alert alert-danger alert-dismissable">
        <button type="button" class="close" data-dismiss="alert"
                aria-hidden="true">
            &times;
        </button>
            ${error}
    </div>
</c:if>
<div class="col-xs-5 col-md-offset-3">
    <div class="panel panel-default">
        <div class="panel-heading">
            <h3 class="panel-title">
                我的信息
            </h3>
        </div>
        <div class="panel-body">
            <table class="table table-hover">
                <tr>
                    <th width="20%">读者证号</th>
                    <td>${readerinfo.readerId}</td>
                </tr>
                <tr>
                    <th>姓名</th>
                    <td>${readerinfo.name}</td>
                </tr>
                <tr>
                    <th>性别</th>
                    <td>${readerinfo.sex}</td>
                </tr>
                <tr>
                    <th>生日</th>
                    <td>${readerinfo.birth}</td>
                </tr>
                <tr>
                    <th>地址</th>
                    <td>${readerinfo.address}</td>
                </tr>
                <tr>
                    <th>电话</th>
                    <td>${readerinfo.phone}</td>
                </tr>
                </tbody>
            </table>
        </div>
        <a class="btn btn-success btn-sm" href="reader_info_edit" role="button">修改</a>
    </div>
</div>


</body>
</html>
