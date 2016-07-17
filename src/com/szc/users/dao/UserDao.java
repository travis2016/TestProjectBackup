package com.szc.users.dao;

import java.util.List;

import com.szc.users.beans.UserBean;


/**
 * 基础数据库操作类
 * 
 * @author travissong
 * dao处理数据逻辑
 */


public interface UserDao {

	
	/**
	 * 添加User
	 */
	public UserBean addUser(UserBean user);
	
	/**
	 * 
	 * @param userName
	 * @return
	 * 判断用户是否存在
	 */
	public boolean isExitByName(String userName);
	
	/**
	 * 
	 * @param userName
	 * @param Password
	 * 查询用户的账号名与密码，是否与输入的一致，一致，则返回true，登录成功，不一致，则返回false，登录失败
	 */
	public boolean selectUser(String userName,String Password);
	
	/**
	 * 直接按id搜索全部用户
	 */
	public List selectUser();
	
	/**
	 * 
	 * @param userName：通过用户名查询显示名称
	 * @return
	 */
	public String SearchNickname(String userName);
}
