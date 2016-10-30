<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>  
<div id="addGoodModal" class="modal fade">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h3 class="modal-title text-center">
						添加商品
					</h3>
				</div>
				<form action="/WebStore/webstore/addGood" method="post">
				<div class="modal-body">
					<div class="row">
						<div class="col-xs-8 col-xss-offset-2">
							<input type="text" name="goodsName" id="goodsName"
								   placeholder="商品名" class="form-control">
							<input type="text" name="goodsPrice" id="goodsPrice"
								   placeholder="价格" class="form-control">
							<input type="text" name="goodsDescribe" id="goodsDescribe"
								   placeholder="描述" class="form-control">
							
						</div>
					</div>
				</div>
				
				<div class="modal-footer">
					<span id="Message" class="glyphicon"></span>
					<button type="submit" id="commitBtn" class="btn btn-success">
						submit
					</button>
				</div>
				</form>
			</div>
		</div>
	</div>