package com.jxd.test;

import org.junit.Test;

import com.jxd.bean.Sys_user;
import com.jxd.dao.impl.UserDaoImpl;
/**
 * UserDaoImpl的测试类
 *	
 * @author jxd
 * @version 2021.3.29
 *
 */
public class UserDaoImpl_test {
	
	public void testGetUnAndPas(){
		Sys_user user = new Sys_user();
		user.setUs_name("小明");
		user.setUs_password("123456");
		UserDaoImpl ud = new UserDaoImpl();
		Sys_user tem_us = ud.getUserByUserNameAndPassword(user);
		System.out.println(tem_us);
	}
	@Test
	public void testInsertUser(){
		Sys_user user = new Sys_user();
		user.setUs_name("小d");
		user.setUs_password("123456");
		user.setUs_email("123@qq.com");
		UserDaoImpl ud = new UserDaoImpl();
		boolean b = ud.insertUser(user);
		System.out.println(b);
	}
	
	//TODO 完成测试类
}
