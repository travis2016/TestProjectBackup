package com.szc.users.action;

import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.szc.users.beans.UserBean;
import com.szc.users.service.UserService;
import com.szc.util.MD5Util;

/**
 * 
 * @author TravisSong
 * 处理登录后的用户的Action(修改用户信息、管理员查询用户)
 */
public class LoginUserAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private UserService userService;  
	  
    public UserBean user;  //User用户	
	private HttpServletRequest request;
  	private HttpServletResponse response;
  	private ServletContext Context;
  	private WebApplicationContext ctx;
  	
  	public UserService getUserService() {
		return userService;
	}

    @Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public UserBean getUser() {
		return user;
	}

	@Autowired
	public void setUser(UserBean user) {
		this.user = user;
	}
  	
	public LoginUserAction() {
		request = ServletActionContext.getRequest();
		response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");//设置传输编码
		Context = ServletActionContext.getServletContext();
		ctx=WebApplicationContextUtils.getRequiredWebApplicationContext(Context);
	}
	
//	@Action(value = "/loginAction",
//			results = {  
//	        @Result(name = "success", location ="/userMain.jsp"),
//	        @Result(name = "ERROR", location ="/Fail.jsp")})
	@Action(value = "/loginAction")
	public void login(){
		PrintWriter out=null;
		JSONObject resultjson = new JSONObject();
		try{	
			String jsonString = IOUtils.toString(request.getInputStream());
			System.out.println("用户参数：==============="+jsonString);
        	JSONObject paramJson = new JSONObject(jsonString); 
			UserService server = ctx.getBean("services",com.szc.users.service.Impl.UserServiceImpl.class);
			UserBean loginrUser=new UserBean(paramJson.getString("username"),MD5Util.string2MD5(paramJson.getString("password")));
			out = response.getWriter();			
			boolean results=server.userLogin(loginrUser.getUserName(), loginrUser.getPassword());
			System.out.println("返回结果："+results);
			if(results==true){
				String nicknames=server.searchUserNickname(loginrUser.getUserName());
				System.out.println(nicknames);
				request.getSession().setAttribute("loginusername",nicknames);				
				resultjson.append("status", 1);
				resultjson.append("nickname", nicknames);
				out.write(resultjson.toString());
			}else{
				resultjson.append("status",0);
				resultjson.append("error_code",20001);
				resultjson.append("errorMsg","用户名或密码错误");
				out.write(resultjson.toString());
			}
			 
			}catch(Exception e){
				e.printStackTrace();
			}
	}
	
}
