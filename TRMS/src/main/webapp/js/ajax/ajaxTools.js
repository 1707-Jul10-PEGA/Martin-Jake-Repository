/**
 * 
 */

var TRlist = null;
var currentUser = null;

function setCurrentUser(user){
	currentUser = user;	
}

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

function getAllTRForUserId(){
	
	var trArray = "";
	
	$.ajax({
		url : 'AJAXRequest?methodRequest=getAllTRByUser',
		data: ({}),
		success : function(data) {	
			//You have to call fillForm internally because AJAX wont return
			//a value since is asynch
			TRlist = data;
			$.each(TRlist, function(i, item) {
				$('#trSelector').append($('<option>', {
					value: item.tr_ID,
			        text : item.tr_ID
				}));
				
			});

						
		}
	});
}

function getTRFill(selector){
	
	var trArray = "";
	
	$.ajax({
		url : 'AJAXRequest?methodRequest=getAllTRByUser',
		data: ({}),
		success : function(data) {	
			//You have to call fillForm internally because AJAX wont return
			//a value since is asynch
			TRlist = data;
			$.each(TRlist, function(i, item) {
				
				if(item.tr_ID == selector){
					$("#daterequested").val(item.date_CREATED);
					$("#eventid").val(item.event_ID);
					
					if(item.approval_STATUS == 1){
						$("#trstatus").val("Submitted, Waiting for Approval");
					}
					if(item.approval_STATUS == 2){
						$("#trstatus").val("DS Approved");
					}
					if(item.approval_STATUS == 3){
						$("#trstatus").val("DH Approved");
					}
					if(item.approval_STATUS == 4){
						$("#trstatus").val("BC Approved");
					}
					if(item.approval_STATUS == 5){
						$("#trstatus").val("Reimbursed");
					}
					if(item.approval_STATUS == 6){
						$("#trstatus").val("Denied");
					}
					if(item.approval_STATUS == 7){
						$("#trstatus").val("DELETED BY USER");
					}
				}

			
			});

						
		}
	});
}

function getCurrentUser(){

	$.ajax({
		url : 'AJAXRequest?methodRequest=getUserInfo',
		data: ({}),
		success : function(data) {	
			//You have to call fillForm internally because AJAX wont return
			//a value since is asynch
			setCurrentUser(data);				
		}
	});
	
}


function getCurrentUserFill(){

	$.ajax({
		url : 'AJAXRequest?methodRequest=getUserInfo',
		data: ({}),
		success : function(data) {	
			$("#requestorname").val(data.fname + " " + data.lname);	
			$("#supervisorid").val(data.supervised_BY);
		}
	});
	
}


function fillRequestedTR(){
	
	var selector = $("#trSelector").val();
	
	$("#deleteRequestButton").val(selector);
					
	getCurrentUserFill();
	
	getTRFill(selector);
	
}

function getSupervisor(){
	var employeeID = $("#employeeID").val();

	$.ajax({
		url : 'AJAXRequest?methodRequest=getSupervisor&supId = ' + employeeID,
		data: ({}),
		success : function(data) {	
			$("#supervisorname").val(data.fname + " " + data.lname);	
			$("#supervisorid").val(data.employee_ID);
		}
	});
	
}

function deleteRequestAjax(requestid){
	$.ajax({
		url : 'AJAXRequest?methodRequest=setTRdeleted&trID='+requestid,
		data: ({}),
		success : function(data) {	
			
		}
	});
}
