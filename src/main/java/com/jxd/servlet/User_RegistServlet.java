package com.jxd.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jxd.bean.Sys_user;
import com.jxd.service.impl.UserServiceImpl;

/**
 * 处理用户注册请求的Servlet
 *
 * @author jxd
 * @date 2021.09.18
 */
@WebServlet("/User_RegistServlet")
public class User_RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserServiceImpl us = new UserServiceImpl();
	private Sys_user user = new Sys_user();
       
    public User_RegistServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		user.setUs_name(request.getParameter("userName"));
		user.setUs_name(request.getParameter("email"));
		user.setUs_name(request.getParameter("password"));
		if (us.regist(user)) {
			//注册成功，重定向到登录页面
			response.sendRedirect("/MonkeyShop/index.html");
		}else{
			//注册失败，转发
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
	}

}
