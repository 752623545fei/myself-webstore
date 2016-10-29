<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.goodContent{
		width: 1090px;
		height: 4200px;
		position: relative;
		left: 80px;
		top: 100px;
	}
	
	.inputBox{
		position: relative;
		left:400px;
		top:30px;
		width: 530px;
		height: 31px;
		border: 2px solid #F40;
	}
	.submitBtn{
		position: relative;
		left:390px;
		top:30px;
		width: 81px;
		height: 35px;
		background-color: #F40;
		color: white;
	}
	.pageBox{
		position: relative;
		left: 500px;
		top: 100px;
	}
</style>
</head>

<body>
	<div id="topLead" class="top"></div>
	<div>
		<form action="/WebStore/webstore/search">
			<input type="text" id="search" name="search" value="${search}" class="inputBox">
			<input type="hidden" value="1" id="page" name="page">
			<button type="submit" class="submitBtn">SEARCH</button>
		</form>
	</div>
	
	<div id="goodContent" class="goodContent">
		
	</div>
	
	<div class="pageBox">
		<div>
			<form action="/WebStore/webstore/search">
				<span>共${pageCount}页</span>
				<span>当前第<input value="${currentPage}" id="currentPage" name="currentPage">页</span>
				<input type="hidden" id="searchBottom" name="search" value="${search}">
				<button type="submit">跳转</button>
			</form>
			
		</div>
	</div>
</body>

<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.js"></script>

<script src="http://apps.bdimg.com/libs/jquery.cookie/1.4.1/jquery.cookie.js"></script>

<script src="/WebStore/resource/js/goodlist.js" type="text/javascript"></script>

<script src="/WebStore/resource/js/topLead.js" type="text/javascript"></script>
</html>