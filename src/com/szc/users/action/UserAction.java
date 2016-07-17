package com.szc.users.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.ActionSupport;
import com.szc.users.beans.UserBean;
import com.szc.users.service.UserService;

/**
 * 
 * @author TravisSong
 * UserAction负责处理用户表的一些操作
 */
public class UserAction  extends ActionSupport {
    
	private static final long serialVersionUID = 1L;  
    private HttpServletRequest request;
  	private HttpServletResponse response;
  	private ServletContext Context;
  	private WebApplicationContext ctx;
  	private PrintWriter out;
  	 
    
  	public UserAction() {
		request = ServletActionContext.getRequest();
		response = ServletActionContext.getResponse();
		response.setContentType("text/json;charset=UTF-8");//设置传输编码
		Context = ServletActionContext.getServletContext();
		ctx=WebApplicationContextUtils.getRequiredWebApplicationContext(Context);
//		response.setContentType("text/json");
  	}
  	
  	
	
	@Action(value = "/selectAction")//ajax的方法，返回的Type必须是json
	public void selectUser() {
		try {
			out= response.getWriter();
			UserBean selectUser=new UserBean();
			UserService server = ctx.getBean("services",com.szc.users.service.Impl.UserServiceImpl.class);
	    	List userList=server.searchUser();
	    	/*
	    	Object[] user1=(Object[])userList.get(0);
	    	JSONArray selectResult = JSONArray.fromObject(userList);
	    	int userid=(Integer)user1[0];
	    	String userName=(String)user1[1];
	    	System.out.println(userid);
	    	System.out.println(userName);
	    	System.out.println(selectResult.toString());
	    	*/
	    	JSONArray selectResult = JSONArray.fromObject(userList);
	    	JSONArray dataJsonArray = new JSONArray();
	    	JSONObject resultJson = new JSONObject();
	    	resultJson.element("status", "1");
	    	resultJson.element("error_code", "0");
	    	for(int i=0;i<selectResult.size();i++){
	    		Object[] user1=(Object[])userList.get(i);
	    		JSONObject dataJsonObject = new JSONObject();
	    		dataJsonObject.element("username", (String)user1[0]);
	    		dataJsonObject.element("sex", (Integer)user1[1]);
	    		dataJsonObject.element("usernickname", (String)user1[2]);
	    		dataJsonObject.element("group", (Integer)user1[3]);
	    		dataJsonArray.add(i, dataJsonObject);
	    	}
	    	resultJson.element("data", dataJsonArray);
	    	LOG.info("返回json数据了");
	    	out.print(resultJson);
	    	out.flush();
	    	out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
