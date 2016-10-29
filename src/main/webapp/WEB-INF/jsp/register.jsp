<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册页面</title>
</head>
	<%@include file="common/head.jsp" %>
<body>
<div style="padding: 100px 100px 10px;width: 500px;margin: 0 auto;">
<form action="/WebStore/user/register/deal" method="post">
  <div class="form-group">
    <label for="name">账号：</label>
    <input type="text" class="form-control" id="name" name="name" placeholder="请输入您的账号">
  </div>
  <div class="form-group">
    <label for="password">密码：</label>
    <input type="password" class="form-control" id="password" name="password" placeholder="请输入您的密码">
  </div>
    <div class="form-group">
        <label for="nickname">昵称：</label>
        <input type="text" class="form-control" id="nickname" name="nickname" placeholder="请输入您的昵称">
    </div>
    <div class="form-group">
        <label for="phone">手机号码：</label>
        <input type="text" class="form-control" id="phone" name="phone" placeholder="请输入您的手机号">
    </div>
    <div class="form-group">
        <label for="email">E-mail：</label>
        <input type="email" class="form-control" id="email" name="email" placeholder="请输入您的邮箱">
    </div>
  <button type="submit" class="btn btn-default">注册</button>
</form>
</div>
</body>
	<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.js"></script>
	
	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
	
	<script src="/WebStore/resource/js/addGood.js" type="text/javascript"></script>
</html>