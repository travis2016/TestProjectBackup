package com.szc.users.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author TravisSong
 * 数据库User表的原型
 */

//Entity：表明当前类是一个持久化类。user是表名，sshProject是数据库名
@Entity
@Table(name="userinfo", catalog="sshProject")
public class UserBean {
	/**
	 * @param userId 数据库User表的主键，唯一的
	 * @param userName 数据库User表的用户名
	 * @param Password 数据库User表的密码
	 * @param gender 数据库User表的性别,0是女性；1是男性
	 * @param nickname 数据库User表的用户显示名
	 */
	

    private int userId;
    private String userName; 
    private int gender;
    private String Password;
    private String nickname;
    private int groupid;
    
	public UserBean(){
		
	}
	
	public UserBean(String userName,String  Password,int gender,String nickname,int groupid){
		this.userName=userName;
		this.Password=Password;
		this.gender=gender;
		this.nickname=nickname;
		this.groupid=groupid;
	}
	
	public UserBean(String userName,String  Password){
		this.userName=userName;
		this.Password=Password;;
	}
	
	public UserBean(String userName){
		this.userName=userName;
	}
	
	@Id
    @Column(name="userid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
	public int getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	@Column(name="userName")
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Column(name="password")
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	 @Column(name="gender")
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	
	@Column(name="nickname")
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Column(name="groupid")
	public int getGroupid() {
		return groupid;
	}

	public void setGroupid(int groupid) {
		this.groupid = groupid;
	}
	
	
}
