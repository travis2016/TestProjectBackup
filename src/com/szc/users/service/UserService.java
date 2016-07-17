package com.szc.users.service;

import java.util.List;

import com.szc.users.beans.UserBean;

/**
 * 
 * @author TravisSong
 *	定义用户接口，service是处理整个业务逻辑的
 */
public interface UserService {
	
	/** 
     * 保存用户 
     * @param users：要添加的用户 
     * @return
     * @  
     * */ 
	public UserBean save(UserBean users);
	
	/** 
     * 判断用户是否存在 
     * @param userName 
     * @return true/false 
     * */  
    public boolean isExitUser(String userName) ;
    
    /**
     * 
     * @param userName
     * @param Password
     * @return 返回true，则证明用户登录成功;false则是用户登录失败，失败原因是用户名密码错误;
     */
    public boolean userLogin(String userName,String Password);
    
    /**
     * 
     * @param userName ：返回用户的显示名称，用作页面显示
     * @return
     */
    public String searchUserNickname(String userName);
    
    /**
     * 用于搜索用户
     */
    public List searchUser();
}
