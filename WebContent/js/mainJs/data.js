/**
 *获取用户数据 
 */
function lodaUserData(){
	alert("111");
	var url = window.location.href+"/selectAction";
	$.ajax( {
		type : "get",
		url : url,
		contentType: "application/json",
		success : function(data) {
			//data为后台返回的Json信息
			if(data && data.status == "1"){
				alert(data.data);
			}else if(data.status == 0 && data.error_code.equal('20001')){
				//20001：参数格式错误
				alert("发生错误");
			}
		},
		 error: function(error){ 
	            ///请求出错处理 	             
	            alert('错误信息：'+error.status);
	     } 
	})
}
