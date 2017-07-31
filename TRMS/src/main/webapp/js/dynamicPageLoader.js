/**
 * 
 */

function loadRequestedSection(contentRequested) {

	alert(contentRequested + " outside");
	
	var contentSpace = document.getElementyById("content");
	var url = 'http://localhost:8050/TRMS/'+contentRequested;
	
	$( "#content" ).load( url );
	
	
	

}