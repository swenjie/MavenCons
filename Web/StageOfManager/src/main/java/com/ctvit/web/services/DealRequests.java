package com.ctvit.web.services;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DealRequests
 */
public class DealRequests extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	//处理请求
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag=request.getParameter("flag");
		String userid=request.getParameter("userid");
		String password=request.getParameter("password");
		System.out.println("Servlet 访问成功");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	//初始化该servlet
	public void init(ServletConfig config) throws ServletException {
		//进行一些初始化工作
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}
	  public DealRequests() {
	        super();
	    }
}
