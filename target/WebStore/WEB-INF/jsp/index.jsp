<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
	<style type="text/css">
		.top{
			width: 100%;
			height: 30px;
			background-color: #cdcdcd;
		}
	</style>
</head>
	<%@include file="common/head.jsp" %>
<body>
	<div id="topLead" class="top"></div>
	<div>
		<form action="/WebStore/webstore/search">
			<input type="text" id="search" name="search">
			<button type="submit">SEARCH</button>
		</form>
	</div>

</body>
	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.js"></script>

	<script src="http://apps.bdimg.com/libs/jquery.cookie/1.4.1/jquery.cookie.js"></script>
	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
	
	<script src="/WebStore/resource/js/addGood.js" type="text/javascript"></script>
	<script src="/WebStore/resource/js/topLead.js" type="text/javascript"></script>
</html>