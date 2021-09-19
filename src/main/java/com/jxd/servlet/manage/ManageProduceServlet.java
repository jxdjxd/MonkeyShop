package com.jxd.servlet.manage;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jxd.bean.Produce;
import com.jxd.dao.ProduceDao;
import com.jxd.dao.impl.ProduceDaoImpl;
import com.jxd.servlet.BaseServlet;
import com.jxd.utils.WebUtils;

@WebServlet("/Manage/ProduceServlet")
public class ManageProduceServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
	private ProduceDao produceDaoImpl = new ProduceDaoImpl();
	
	protected void getAllProduce(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cpage = 1; //当前页
		int count = 5; //每一页中的数目
		
		//获取用户输入的页面参数
		String cp = request.getParameter("cp");
		if(cp!=null){
			cpage = Integer.parseInt(cp);
		}
		int[] arr = produceDaoImpl.getTotalAndPageCount(count);
		
		List<Produce> list = produceDaoImpl.getSection(cpage, count);
		
		//将信息发送到request域中
		request.setAttribute("produceList", list);
		request.setAttribute("tsum", arr[0]);
		request.setAttribute("tpage", arr[1]);
		request.setAttribute("cpage", cpage);
		
		request.getRequestDispatcher("/manage/admin_PrdManage.jsp").forward(request, response);
	}
	
	protected void addProduce(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Produce produce = new Produce();
		produce.setPrd_name(request.getParameter("prd_name"));
		produce.setPrd_class(request.getParameter("prd_class"));
		produce.setPrd_stockQty(Integer.parseInt(request.getParameter("prd_stockQty")));
		produce.setPrd_price(Integer.parseInt(request.getParameter("prd_price")));
		System.out.println(produce);
		produceDaoImpl.addProduce(produce);
		request.getRequestDispatcher("ProduceServlet?method=getAllProduce").forward(request, response);
	}
	

}
