package com.Test.cn;

import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet1 implements Servlet {

	@Override
	public void destroy() {
		
		
	}

	@Override
	public ServletConfig getServletConfig() {
		
		return null;
	}

	@Override
	public String getServletInfo() {
		
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response)throws ServletException, IOException {
		System.out.println(request.getParameter("username"));//接受浏览器提交过来的参数
		System.out.println(request.getParameter("userpwd"));
		String user = request.getParameter("username");
		String pwd = request.getParameter("userpwd");
		if(user.equals("admin")&&pwd.equals("123")){
			response.getWriter().println("username and password are right!");
		}else{
			response.getWriter().println("username or password are error!");
		}
			
		
	}

}
