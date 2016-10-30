/**
 * 
 */
$('#addGoodBtn').click(function(){
	
	var addGoodModal = $('#addGoodModal');
	addGoodModal.modal({
		show:true,
		//backdrop:'static',
		keyboard:false
	});
})

$('#commitBtn').click(function(){
	var node = $('#Message');
	$('#form').submit();
})