/**
 * 
 */


function fillForm(user){
	var employeeId = user.employee_ID;
	var firstname = user.fname;
	var lastname = user.lname;
	
	$("#employeeID").val(employeeId);
	$("#firstname").val(firstname);
	$("#lastname").val(lastname);
	$("#requestdate").val(getFormatedDate);
	
	
}

function getFormatedDate(){
	var today = new Date();
	var dd = today.getDate();
	var mm = today.getMonth()+1; //January is 0!
	var yyyy = today.getFullYear();

	if(dd<10) {
	    dd = '0'+dd
	} 

	if(mm<10) {
	    mm = '0'+mm
	} 

	today = yyyy + '-' + mm + '-' + dd;
	
	return today;
}

function preloadTRForm() {
	var user;

	$.ajax({
		url : 'AJAXRequest?methodRequest=getUserInfo',
		data: ({}),
		success : function(data) {	
			//You have to call fillForm internally because AJAX wont return
			//a value since is asynch
			fillForm(data);
			
		}
	});

}
