package com.jxd.service.impl;

import com.jxd.bean.Sys_user;
import com.jxd.dao.UserDao;
import com.jxd.dao.impl.UserDaoImpl;
import com.jxd.service.UserService;

public class UserServiceImpl implements UserService {
	private UserDao ud = new UserDaoImpl();
	@Override
	public Sys_user login(Sys_user user) {
		return ud.getUserByUserNameAndPassword(user);
	}

	@Override
	public boolean regist(Sys_user user) {
		return ud.insertUser(user);
	}

}
