package com.szc.users.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.szc.users.beans.UserBean;
import com.szc.users.dao.Impl.UserDaoImpl;
import com.szc.users.service.UserService;

/**
 * 注册用户
 * @author TravisSong
 *
 */

@Service("UserService")
public class UserServiceImpl implements UserService {

	private UserDaoImpl usersdao;
	@Override
	public UserBean save(UserBean user) {
			
		return usersdao.addUser(user);
	}
	
	@Override
	public boolean isExitUser(String userName) {
		return usersdao.isExitByName(userName);
	}
	
	@Override
	public boolean userLogin(String userName, String Password) {
		return usersdao.selectUser(userName, Password);
	}
	
	@Override
	public String searchUserNickname(String userName) {	
		return usersdao.SearchNickname(userName);
	}
	
	public UserDaoImpl getUsersdao() {
		return usersdao;
	}
	public void setUsersdao(UserDaoImpl usersdao) {
		this.usersdao = usersdao;
	}

	@Override
	public List searchUser() {
		return usersdao.selectUser();
	}

	
}
