<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="logins" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">    
    <title>用户登录页面</title>        
	  <meta http-equiv="pragma" content="no-cache">
	  <meta http-equiv="cache-control" content="no-cache">
	  <meta http-equiv="expires" content="0">    
	  <script type="text/javascript" src="js/userlogin.js"></script>
      <script type="text/javascript" src="js/jquery-1.12.3.min.js"></script>
      <script type="text/javascript" src="js/jquery.json.min.js"></script>
      <script type="text/javascript" src="js/bootstrap.min.js"></script>
      <script type="text/javascript" src="js/jquery.backstretch.min.js"></script>
      <script type="text/javascript" src="js/scripts.js"></script>
	  <script type="text/javascript" src="js/placeholder.js"></script>
      <link rel="stylesheet" href="css/bootstrap.min.css">
      <link rel="stylesheet" href="css/Register.css">
      <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css" type="text/css">
      <link rel="stylesheet" href="css/style.css">
       
       <!-- Favicon and touch icons -->
        <link rel="shortcut icon" href="assets/ico/favicon.png">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="img/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="img/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="img/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="img/ico/apple-touch-icon-57-precomposed.png">
        
 </head>
 <body>
 	 <!-- Top content -->
        <div class="top-content">
 		  <div class="inner-bg">
 		     <div class="container">
 				<div class="row">
 				  <div class="col-sm-6 col-sm-offset-3 form-box">
 				    <div class="form-top">
                        <div class="form-top-left">
                        	<h3>Login to Strees site</h3>
                            <p>Enter your username and password to log on:</p>
                         </div>                      
                     </div>
                     <div class="form-bottom">
				 	 <!-- <div class="container" style="margin-top:100px"> -->
				  		<form class="Loginform" id="loginAction" name="loginAction" action="<%=basePath %>logins/loginAction.action" method="post">
					 		<div class="form-group">
					 			<!-- <label class="sr-only">用户名:</label> -->
								<font class="loginfont">用户名：</font>
								<input type="text" name="user.userName" id="loginusername" class="form-username form-control mylogincss" onclick="DelHtml();" />								
							</div>
							<div class="form-group">
								<font class="loginfont">密&nbsp;码：</font>
								<input type="password" name="user.password" class="form-password form-control mylogincss" id="loginpassword" />
							</div>
								<!-- <font class="errormsgs" color="red" style="margin-left: 75px;" hidden="hidden">用户名或密码失败</font> -->
							<div class="form-group">
								<button type="button" id="loginbtn" class="btn btn-primary" onclick="if(checkuserlogin()==true){login();};">登录系统</button>
								<a href="Register.jsp"><button type="button" class="btn btn-primary" >注册</button> </a>
							</div>
						</form>
					</div>
					</div>
		  		</div>
			</div>
	  	</div>
   </div>
 </body>
</html>