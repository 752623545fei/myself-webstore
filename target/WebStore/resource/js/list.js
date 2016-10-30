$(document).ready(function(){
	$.ajax({
		type : "GET",
		url : "/WebStore/webstore/gettype",
		dataType : "json",
		success : function(data){
			for(x in data){
				$('#goodsTypeName').append('<option>' + data[x] + '</option>');
			}
			
		},
		error : function(){
			
		}
	});
})