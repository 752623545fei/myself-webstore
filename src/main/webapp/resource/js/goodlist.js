$(document).ready(function(){
	var search = $("#search").val();
	var currentPage = $('#currentPage').val();
	$.ajax({
		type : "POST",
		url : "/WebStore/webstore/query",
		data : {search:search,
				currentPage:currentPage},
		dataType : "json",
		success : function(data){
			for(x in data){
				
				var picture=data[x].picture;
				var id=data[x].id;
				var title=data[x].title;
				var locationState=data[x].locationState;
				var locationCity=data[x].locationCity;
				var price=data[x].price;
				
				$('#goodContent').append('<div class="goodBox goodBox' + x + '">' +
						'<div style="width:250px;height:250px"><img src="/WebStore/img/' + picture + '.jpg" style="width: 250px;height: 250px"/></div>' +
						'<div class="price">￥' + price + '</div>' +
						'<div class="title">' + title+ '</div>' +
						'<div class="location">'+ locationState+ " "+ locationCity + '</div>' +
						"</div>");
			}
			$(".goodBox").css({"width": "250px",
				"height": "400px",
				"border": "1px solid #EDEDED"});
			
			$(".title").css({"font":"sans-serif",
							 "font-size":"12px",
							 "color":"#3d3d3d"});
			
			$(".price").css({"font-family":"verdana,arial",
							 "font-size":"18px",
							 "font-weight":"700",
							 "color":"#F40"});
			$(".location").css({"font":"sans-serif",
							 "font-size":"12px",
							 "float":"right",
							 "color":"#888"});
			for (var i = 0; i < 10; i++) {
				for(var j = 0; j < 4; j++){
					var width = 270;
					var height = 420;
					$(".goodBox"+ (i*4+j) +"").css({"position":"absolute",
										"left": +j*width+"px",
										"top": +i*height+"px",
										});
				}
			}
			
			
			
			
		},
		error : function(){
			alert("xxx");
		}
	});
	
	
	
})