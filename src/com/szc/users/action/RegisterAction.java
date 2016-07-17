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
 * Action负责处理请求
 * action调用service的方法，service调用dao中的方法
 */
public class RegisterAction extends ActionSupport {  
  
    private static final long serialVersionUID = 1L;  
    private UserService userService;  
  
    public UserBean user; 
    private HttpServletRequest request;
  	private HttpServletResponse response;
  	private ServletContext Context;
  	private WebApplicationContext ctx;
  	
	public RegisterAction() {
		request = ServletActionContext.getRequest();
		response = ServletActionContext.getResponse();
		response.setContentType("text/html;charset=UTF-8");//设置传输编码
		Context = ServletActionContext.getServletContext();
		ctx=WebApplicationContextUtils.getRequiredWebApplicationContext(Context);
	}
  
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

	
	


	//	@Action(value = "/regAction",
//			results = {  
//	        @Result(name = "success", location ="/RegisterSuccess.jsp"),  
//	        @Result(name = "error", location ="/Fail.jsp") })
	@Action(value = "/regAction")//ajax的方法，返回的Type必须是json
	public void registUser() {  
        try {  
        	System.out.println("执行注册123");
        	PrintWriter out=null;
        	String jsonString = IOUtils.toString(request.getInputStream());
        	JSONObject paramJson = new JSONObject(jsonString);    
//        	System.out.println(paramJson.getString("nickname"));
        	UserBean registerUser=new UserBean(paramJson.getString("username"),MD5Util.string2MD5(paramJson.getString("password"))
        						,Integer.parseInt(paramJson.getString("gender")), java.net.URLDecoder.decode(paramJson.getString("nickname"),"UTF-8"),3);
        	UserService server = ctx.getBean("services",com.szc.users.service.Impl.UserServiceImpl.class);
        	server.save(registerUser);	// register user 
            out = response.getWriter();
            String resultString = "{\"status\":1}";
            JSONObject resultJson = new JSONObject(resultString); 
            System.out.println(resultJson);
            out.println(resultJson);
//             return SUCCESS;  
  
        } catch (Exception e) {  
            e.printStackTrace();  
//            return ERROR;  
        } 
    }       
     // System.out.println(jsonString);
//     	System.out.println("user: " + user.getUserName() + "\n" + "pwd: " + user.getPassword()+"\n"+"nickname:"+user.getNickname());
//    	 boolean judgeExit=server.isExitUser(user.getUserName());
//    	 if(judgeExit==false){server.save(registerUser);	// register user
//    	 }else{
//		 return ERROR;
//	 }

	
	
	/**
	 * 判断用户是否存在。用户存在，则返回true，用户不存在，则返回false
	 */
	@Action(value="/judgeUserExitAction")
	public void judgeUser(){
		try {
			PrintWriter out=null;
			UserService server = ctx.getBean("services",com.szc.users.service.Impl.UserServiceImpl.class);
//			System.out.println(user.getUserName());
			boolean judgeExit=server.isExitUser(user.getUserName());
//			System.out.println("username="+user.getUserName());
			out = response.getWriter();
			if(judgeExit==true){
				out.print("true");
			}else{
				out.print("false");
			}
			out.flush();
			out.close();
		
	}catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  
}

	
	
	}  