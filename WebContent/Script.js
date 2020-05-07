/**


 * The following JavaScript function 
 * utilises a jQuery and
 *  AJAX request to connect to your 
 *  servlet through the HTML form input


 */


$(document).ready(function () {


	$("#SubmitButton").click(function () {


		var dataArray = $("#userInputForm").serializeArray(),


			dataObj = {};



		$(dataArray).each(function (i, field) {



			dataObj[field.name] = field.value;



		});

		//alert (dataObj['firstName'] + " " +  dataObj['lastName'])
		//alert (dataObj['Yourname'])


		//alert (dataObj['username'] + " " +  dataObj['password'])


		$('#userInputForm').on('submit', function (e) {
			$.post('http://localhost:8080/Assignment2_2019/myLet', 
				{
					s_Number: dataObj['number'],
			
				},



				function (data, status) {
					
					var array = data.split(",",2);
					var deciout= array[1];
					var hexout= array[0];
					$("#AjaxServletResponse").text(deciout);
					$("#myAjaxServletResponse").text(hexout);
				}).error(function () {

			});
			e.preventDefault();
		});


	});


});