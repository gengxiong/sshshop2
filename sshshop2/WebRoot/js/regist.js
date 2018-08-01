$(function() {
	$("#username").onblur(function() {
		$.ajax({
			type : "post",
			url : "regist",
			data : {
				username : $("#username").val()
			},
			success : function(data) {
				$("#th").append("<td>" + data + "</td>");

			}
		})
	})
})