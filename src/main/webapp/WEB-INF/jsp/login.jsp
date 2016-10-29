<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
</head>
	<%@include file="common/head.jsp" %>		
<body>
<div style="padding: 100px 100px 10px;width: 500px;margin: 0 auto;">
<form action="/WebStore/user/login/deal" method="post" id="loginForm">
	<div class="form-group">
    <label for="userName">账号：</label>
    <input type="text" class="form-control" id="userName" name="name" placeholder="请输入您的账号">
  </div>
  <div class="form-group">
    <label for="userPassword">密码:</label>
    <input type="password" class="form-control" id="userPassword" name="password" placeholder="请输入您的密码">
  </div>
  <div class="checkbox">
    <label>
      <input type="checkbox" id="rememberBox"> 记住密码
    </label>
  </div>
  <button type="button" class="btn btn-default" id="loginBtn">登录</button>
  <a href="/WebStore/user/register">
  	<button type="button" class="btn btn-default">注册</button>
  </a>
</form>
</div>
</body>
	<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.js"></script>

    <script src="http://apps.bdimg.com/libs/jquery.cookie/1.4.1/jquery.cookie.js"></script>
	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
	
	<script src="/WebStore/resource/js/addGood.js" type="text/javascript"></script>
    <script src="/WebStore/resource/js/login.js" type="text/javascript"></script>
</html>