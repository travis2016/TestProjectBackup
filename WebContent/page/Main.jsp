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
<title>压测主页面</title>
	  <base href="<%=basePath%>">    
	  <meta http-equiv="pragma" content="no-cache">
	  <meta http-equiv="cache-control" content="no-cache">
	  <meta http-equiv="expires" content="0">    
	  <link rel="stylesheet" href="css/Mycss/Main.css">   
</head>
<body>
	<div id="maintop">
		<nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
               <a class="navbar-brand" href="javascript:void(0)">Stress Main</a>
            </div>
            <div class="dropdown">
	           <ul class="nav navbar-top-links  navbar-right">
	           	  <li class="dropdown">
	           	  	<a href="#" class="dropdown-toggle" data-toggle="dropdown" >
	           	  		<i class="fa fa-user fa-fw"></i>  <i class="fa fa-caret-down"></i>
	           	  	</a>
	           	  	<ul class="dropdown-menu">
	           	  	  <li>
	           	  	   <a href="<%=basePath %>userMain.jsp">
	           	  	      <i class="fa fa-user fa-fw"></i>
                          <i> <%=uname %></i>
                       </a>
                       </li>
                       <li>
						 <a href="<%=basePath %>login.jsp">                       
	                          <i class="fa fa-sign-in fa-fw"></i>
	                         <i>退出系统</i>
	                     </a>
                       </li>
	           	  	</ul>
	           	  </li>
	           </ul> 
	        </div> 
	        
	        <div class="navbar-default sidebar" role="navigation">
	          <div class="sidebar-nav navbar-collapse">
	        	<ul class="nav" id="side-menu">
	        		<li class="sidebar-search">
	        			<div class="input-group custom-search-form">
                                <input type="text" class="form-control" placeholder="Search...">
                                <span class="input-group-btn">
                                <button class="btn btn-default" type="button">
                                    <i class="fa fa-search"></i>
                                </button>
                            </span>
                            </div>
                            <!-- /input-group -->
	        		</li>
	        		
	        		<li>
                            <a href="#"><i class="fa fa-bar-chart-o fa-fw"></i> 用户管理<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                                <li>
                                    <a href="#" id="useLink1">用户信息页</a>
                                </li>
                                <li>
                                    <a href="#" id="useLink2">权限分配页</a>
                                </li>
                                <li>
                                    <a href="morris.html">操作日志查看页</a>
                                </li>
                            </ul>
                            <!-- /.nav-second-level -->
                    </li>
	        	</ul>
	          </div>
	        </div>    
        </nav>
        
         <div id="page-wrapper" class="pageNorm" name="content">
         	<%-- <iframe class="pageframe" id="pageIframe" name="content" src="<%=basePath %>page/userManager/userinfo.jsp" /> --%>
         </div>
	</div>
	
		<!-- <font color="blue">欢迎用户： -->	
</body>
</html>
