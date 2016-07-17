<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ page import="java.uti1.*" %>
<%@ taglib prefix="logins" uri="/struts-tags"%>  
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String uname=(String)request.getSession().getAttribute("loginusername");
%>
<!DOCTYPE html>
<html>
<head>
<title>主页面</title>
	 <base href="<%=basePath%>">    
	  <meta http-equiv="pragma" content="no-cache">
	  <meta http-equiv="cache-control" content="no-cache">
	  <meta http-equiv="expires" content="0">    
      <link rel="stylesheet" href="css/bootstrap.min.css">
      <link rel="stylesheet" href="css/metisMenu/metisMenu.min.css">
      <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css" type="text/css">
      <link rel="stylesheet" href="css/style.css">
      <script type="text/javascript" src="js/jquery-1.12.3.min.js"></script>
      <script  src="js/bootstrap.min.js"></script>
      <script type="text/javascript" src="js/metisMenu/metisMenu.min.js"></script> 
      <script type="text/javascript" src="js/mainJs/main.js"></script> 
     <!--  <script type="text/javascript">
      	$(document).ready(function(){ 
				document.getElementById("pageIframe").scrolling="hidden";
			});
	  </script> -->
</head>
<body>
	 <jsp:include page="/page/Main.jsp"></jsp:include>
	 
</body>
</html>