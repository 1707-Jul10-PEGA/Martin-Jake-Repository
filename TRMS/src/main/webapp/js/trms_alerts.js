/**
 * 
 */

function submitTrmsPrompt(){
	
	swal({
		  title: 'Are you sure you want to submit?',
		  text: "Click yes if your information is correct",
		  type: 'warning',
		  showCancelButton: true,
		  confirmButtonColor: '#3085d6',
		  cancelButtonColor: '#d33',
		  confirmButtonText: 'Yes, submit it!'
		}).then(function () {
			swal(
		    'Your request has been submited!',
		    'You can check your request status under `View My Requests` tab',
		    'success'
		  )
		})
		 
}