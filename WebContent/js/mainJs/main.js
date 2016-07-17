$(function() {
	//导航栏生效
    $('#side-menu').metisMenu();
});

$(document).ready(function(){ 
	//点击用户管理菜单的用户信息页
	$("#useLink1").click(function () { 
	$("#page-wrapper").load("page/userManager/userinfo.jsp"); 
	return false;  //阻止标签跳转
	});
	
	$("#useLink2").click(function () { 
		$("#page-wrapper").load("page/userManager/PermissionAssignment.jsp");
		return false;
		}); 
}); 


