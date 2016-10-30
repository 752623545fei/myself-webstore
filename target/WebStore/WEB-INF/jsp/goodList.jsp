<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>商品列表页</title>
	<%@include file="common/head.jsp" %>
	<%@include file="common/tag.jsp" %>
	
  </head>
  <body>
    <div class="container">
    	<div class="panel panel-default">
    		<div class="panel panel-heading text-center">
    			<h2>商品列表</h2>
    		</div>
    		<button type="button" id="addGoodBtn" class="btn btn-info">
				添加商品
			</button>
    		<!-- 添加商品modal -->
    		
    			<div id="addGoodModal" class="modal fade">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h3 class="modal-title text-center">
						添加商品
					</h3>
				</div>
				<form action="/WebStore/webstore/addGood" method="post" enctype="multipart/form-data" id="form">
				<div class="modal-body">
					<div class="row">
						<div class="col-xs-8 col-xss-offset-2">
							<input type="text" name="goodsName" id="goodsName"
								   placeholder="商品名" class="form-control">
							<select name="goodsTypeName" id="goodsTypeName" class="form-control">
							</select>
							<input type="number" name="goodsNum" id="goodsNum"
								   placeholder="库存" class="form-control">
							<input type="text" name="goodsPrice" id="goodsPrice"
								   placeholder="价格" class="form-control">
							<input type="text" name="goodsDescribe" id="goodsDescribe"
								   placeholder="描述" class="form-control">
							<input type="file" name="imgFile" id="imgFile" 
							       placeholder="商品图片" class="form-control">
						</div>
					</div>
				</div>
				
				<div class="modal-footer">
					<span id="Message" class="glyphicon"></span>
					<button type="button" id="commitBtn" class="btn btn-success">
						submit
					</button>
				</div>
				</form>
			</div>
		</div>
	</div>
	
	<!-- 结束 -->
    		
    		<div class="panel-body">
    			<table class="table table-hover">
    				<thead>
    					<tr>
    						<td>商品编号</td>
    						<td>图片</td>
    						<td>名称</td>
    						<td>商品类别</td>
    						<td>库存</td>
    						<td>价格</td>
    						<td>描述</td>
    					</tr>
    				</thead>
    				<tbody>
    					<c:forEach var="sk" items="${goodList}">
    						<tr>
    							<td>${sk.goodsId}</td>
    							<td><img src="${sk.goodsImageSource }" height="40" width="40"/></td>
    							<td>${sk.goodsName}</td>
    							<td>${sk.goodsTypeName}</td>
    							<td>${sk.goodsNum}</td>
    							<td>${sk.goodsPrice}</td>
    							<td>${sk.goodsDescribe}</td>
    							<!--  <td>
    								<a class="btn btn-info" href="/seckill/seckill/${sk.seckillId}/detail" target="_blank">link</a>
    							</td>-->
    						</tr>
    					</c:forEach>
    				</tbody>
    			</table>
    		</div>
    	</div>
    </div>

  </body>
  
 	
  	<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
	<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.js"></script>
	
	<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
	<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
	
	<script src="/WebStore/resource/js/addGood.js" type="text/javascript"></script>
	
	<script src="/WebStore/resource/js/list.js" type="text/javascript"></script>
</html>