/**
 * 
 */

function loadRequestedSection(contentRequested) {

	$("#content").load(contentRequested);
}

function viewMyRequests(contentRequested) {
	loadRequestedSection(contentRequested);
//	preloadTRForm();
	makeTabActive("myRequestsTab");
}

function newTR(contentRequested) {
	loadRequestedSection(contentRequested);
	preloadTRForm();
	makeTabActive("newTRTab");
}


function loadHome(contentRequested){
	loadRequestedSection(contentRequested);
	makeTabActive("homeTab");
}

function showTR(id) {
	$(".tr_box").hide();
	$("#" + id).show();
}

function myRequests(contentRequested) {
	loadRequestedSection(contentRequested);
	makeTabActive("myRequestsTab");
	fillTRSelector();
}

function fillTRSelector() {
	var selector = $("#trSelector");
	getAllTRForUserId();

}

function makeTabActive(id){
	$(".active").toggleClass("active");	
	$("#"+id).addClass("active");
}
