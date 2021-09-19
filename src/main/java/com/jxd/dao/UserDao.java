package com.jxd.dao;

import com.jxd.bean.Sys_user;
/**
 * 用户类接口
 *	
 * @author jxd
 * @version 2021年4月9日
 *
 */
public interface UserDao{
	/**
	 * 通过用户名和密码来查询用户
	 * @param user
	 * @return sys_user
	 */
	public Sys_user getUserByUserNameAndPassword(Sys_user user);
		
	/**
	 * 用户登录
	 * @param user
	 * @return boolean
	 */
	public boolean insertUser(Sys_user user);
	
	/**
	 *  获取用户表中当前的最大用户id
	 * @return the max id in the table sys_user
	 */
	
	
	
}
