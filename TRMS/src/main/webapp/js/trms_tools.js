/**
 * 
 */

function loadRequestedSection(contentRequested) {
		
	$( "#content" ).load(contentRequested);
	
}

function showTR(id){
$(".tr_box").hide();
$("#"+id).show();	
}