<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="regists" uri="/struts-tags"%>  
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
  <head>
     <base href="<%=basePath%>">    
      <title>注册页面</title> 
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
 </head>
 <body>
 	<div class="top-content">
 		  <div class="inner-bg">
 		     <div class="container">
 		        <div class="row">
 				  <div class="col-sm-6 col-sm-offset-3 form-box">
 				    <div class="form-top">
                        <div class="form-top-left">
                        	<p>Register our Strees site</p>
                         </div>
                     </div>
                        	 <div class="form-bottom">
	                             <form class="Registform" id="regAction" name="regAction" action="<%=basePath %>/regist/regAction.action" method="post">
						 		 	<div class="form-group">
						 		 		<font class="registerfont">显示名：</font>
						 		 		<input type="text" name="user.nickname"  id="textnickname" class="form-username form-control myregistercss">
						 		 	</div>
						 		 	<div class="form-group">
						 		 		<font class="registerfont">用户名：</font>
						 		 		<input type="text" name="user.userName"  id="textusername" class="form-username form-control myregistercss">
						 		 	</div>
						 		 	<div class="form-group">
						 		 		<font class="registerfont">密&nbsp;码：</font>
						 		 		<input type="password" name="user.password"  id="textpassword" class="form-username form-control myregistercss">
						 		 	</div>
						 		 	<div class="form-group">
						 		 		<font class="registerfont">性&nbsp;别:</font>
						 		 		<select name="user.gender" id="regAction_user_gender" class="span2 registerSelectcss">
				    	   				 		<option value="1" selected="selected">男</option>
				    	    					 <option value="0">女</option>
				    					</select>
						 		 	</div>
						 		 	<div align="center">
				    			  		 <input type="button" class="btn btn-primary" id="regAction__execute" name="method:execute" value="注册压测账号" onclick="if(check()==true && checkUserExit()==true){register();};" />
				    	  		 	</div>
								</form>
                     	</div>                      
                
			</div>
		</div>
	</div>
	</div>
 </body>
 </html>
	<!-- <div class="submit_button">  
<p> 用户名：<input type="text" name="user.userName" id="textusername" > </p>
<p> 密  码：<input type="password" name="user.password" id="textpassword"></p>
<p>
<select name="user.gender" id="regAction_user_gender">
<option value="1" selected="selected">男</option>
 <option value="0">女</option>
</select>
</p>
</div>  
<div align="left">
<input type="button" class="btn btn-primary" id="regAction__execute" name="method:execute" value="注册" onclick="if(check()==true && checkUserExit()==true){register();};" />
<input type="button" class="btn btn-primary" id="regAction__login" name="method:login" value="登录" onclick="if(check()==true){login();}"  />
</div> -->
