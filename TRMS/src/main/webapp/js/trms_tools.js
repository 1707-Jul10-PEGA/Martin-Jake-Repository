/**
 * 
 */

function loadRequestedSection(contentRequested) {
		
	$( "#content" ).load(contentRequested);
}

function comboNewTR(contentRequested){
	loadRequestedSection(contentRequested);
	preloadTRForm();
}

function showTR(id){
$(".tr_box").hide();
$("#"+id).show();	
}