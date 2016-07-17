<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">    
    <title>注册成功</title>        
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
                            <p>注册成功，点击<a href="login.jsp">链接</a>返回登录页面</p>
                         </div>                      
                     </div>
                  </div>
              </div>
           </div>
        </div>
 </div>
 </body>
</html>