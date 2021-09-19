package com.jxd.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jxd.bean.Sys_user;
import com.jxd.service.UserService;
import com.jxd.service.impl.UserServiceImpl;
import com.jxd.utils.WebUtils;
/**
 * 处理用户的所有请求的servlet
 *	
 * @author jxd
 * @version 2021.04.03
 *
 */
@WebServlet("/UserServlet")
public class UserServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * 处理用户登录的Servlet方法
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void User_login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserService us = new UserServiceImpl();
		
		request.setCharacterEncoding("utf-8");
		Sys_user user = new Sys_user();
		user = WebUtils.param2bean(request, user);
		if (us.login(user) == null){
			//登录失败，转发到登录页面
			request.setAttribute("message", "用户名或密码错误！");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}else{
			//登录成功，重定向到首页
			response.sendRedirect("/MonkeyShop/index.html");
		}
	}

	protected void User_regist(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserService us = new UserServiceImpl();
		Sys_user user = new Sys_user();
		
		request.setCharacterEncoding("utf-8");
	    user = WebUtils.param2bean1(request, user);
		if (us.regist(user)) {
			//注册成功，重定向到登录页面
			response.sendRedirect("/MonkeyShop/index.html");
		}else{
			//注册失败，转发
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
	}

   
}
