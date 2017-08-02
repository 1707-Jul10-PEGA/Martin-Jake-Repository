/**
 * 
 */

function loadRequestedSection(contentRequested) {

	$("#content").load(contentRequested);
}

function viewMyRequests(contentRequested) {
	loadRequestedSection(contentRequested);
	preloadTRForm();
}

function showTR(id) {
	$(".tr_box").hide();
	$("#" + id).show();
}

function myRequests(contentRequested) {
	loadRequestedSection(contentRequested);
	fillTRSelector();
}

function fillTRSelector() {
	var selector = $("#trSelector");
	getAllTRForUserId();

}


