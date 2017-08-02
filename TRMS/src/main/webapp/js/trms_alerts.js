/**
 * 
 */

function submitTrmsPrompt(formName){
	
	swal(
		{
		  title: 'Are you sure you want to submit?',
		  text: "Click yes if your information is correct",
		  type: 'warning',
		  showCancelButton: true,
		  confirmButtonColor: '#3085d6',
		  cancelButtonColor: '#d33',
		  confirmButtonText: 'Yes, submit it!'
		},function(isConfirm){
	        if (isConfirm){
	        	alert("working");
	        	
	        }
	    }	
		).then(function () {
			swal(
		    'Your request has been submited!',
		    'You can check your request status under `View My Requests` tab',
		    'success'
		  ).then(function () {
			  $("#"+formName).submit();
		  })
		  		  
		})
		 
}

function submitForm(formName){
	
	$( "#"+formName ).submit(function( event ) {
		  event.preventDefault();
		});
	
}