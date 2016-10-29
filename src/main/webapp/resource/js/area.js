$(document).ready(function(){
	$("#secondArea").hide();
	$("#thirdArea").hide();
	$.ajax({
		type : "POST",
		url : "/WebStore/common/area/first",
		data : {parent:0},
		dataType : "json",
		success : function(data){
			
			for(x in data){
				$('#firstArea').append( '<option value=" ' + data[x].areaNo + ' " > ' + data[x].areaName + ' </option>');
			}
			
		},
		error : function(){
			
		}
	});
	
	$("#firstArea").change(function(){
		$("#secondArea").hide();
		$("#thirdArea").hide();
		$("#secondArea").html("");
		$("#thirdArea").html("");
		var firstArea = $("#firstArea").val();
		$.ajax({
			type : "POST",
			url : "/WebStore/common/area/first",
			data : {parent:firstArea},
			dataType : "json",
			success : function(data){
				if(data!=null && data!=""){
					$("#secondArea").show();
					for(x in data){
						$('#secondArea').append( '<option value=" ' + data[x].areaNo + ' " > ' + data[x].areaName + ' </option>');
					}
				}
			},
			error : function(){
				
			}
		});
		
	});
	
	
	$("#secondArea").change(function(){
		$("#thirdArea").hide();
		$("#thirdArea").html("");
		var secondArea = $("#secondArea").val();
		$.ajax({
			type : "POST",
			url : "/WebStore/common/area/first",
			data : {parent:secondArea},
			dataType : "json",
			success : function(data){
				if(data!=null && data!=""){
					$("#thirdArea").show();
					for(x in data){
						$('#thirdArea').append('<option value=" ' + data[x].areaNo + ' " > ' + data[x].areaName + ' </option>');
					}
				}
			},
			error : function(){
				
			}
		});
		
	});
})