package com.Test.cn;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdk.internal.org.objectweb.asm.commons.SerialVersionUIDAdder;
import jdk.nashorn.internal.runtime.regexp.joni.Config;

public class LoginServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String value1 = getServletConfig().getServletContext().getInitParameter("username");//通过servletContext对象拿到配置文件里面的键，从而找到所对应的值
		String value2  = getServletConfig().getServletContext().getInitParameter("userpassword");
		String user = request.getParameter("username");//拿到浏览器发送过来的请求
		String pwd  = request.getParameter("userpwd");
		if(user.equals(value1)&&pwd.equals(value2)){
			response.getWriter().println("username and password are right!");
		}else{
			response.getWriter().println("username or password are error! ");
		}
		  HttpServletRequest request2 = (HttpServletRequest) request;
		  String method = request2.getMethod();
		  System.out.println(method);
	}

}
