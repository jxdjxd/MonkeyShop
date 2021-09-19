package com.jxd.service;

import com.jxd.bean.Sys_user;

public interface UserService {
	public Sys_user login(Sys_user user);
	public boolean regist(Sys_user user);
}
