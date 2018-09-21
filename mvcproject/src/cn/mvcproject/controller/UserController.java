package cn.mvcproject.controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;

import javax.management.RuntimeErrorException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.fabric.xmlrpc.base.Data;

import jdk.nashorn.internal.runtime.regexp.JoniRegExp.Factory;
import cn.mvcproject.model.User;
import cn.mvcproject.service.FactoryService;
import cn.mvcproject.service.UserService;

public class UserController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	UserService  userService = FactoryService.getUserService();//从UserService类里面拿到
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		String mn = req.getServletPath();
		mn=mn.substring(1);
		mn=mn.substring(0, mn.length()-4);
		try{
		Method method = this.getClass().getDeclaredMethod(mn, HttpServletRequest.class,HttpServletResponse.class);
		method.invoke(this, req,resp);
		} catch (Exception e){
			e.printStackTrace();
		}

  }
	public void add(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
		User user = new User();
		user.setUsername(req.getParameter("username"));
		user.setPasword(req.getParameter("pasword"));
		user.setAddress(req.getParameter("address"));
		user.setPhoneNo(req.getParameter("phoneNo"));
		user.setRegDate(new Date());
		int rows = userService.save(user);
		if(rows>0){
			resp.sendRedirect(req.getContextPath()+"/index.jsp");
		}else{
			resp.sendRedirect(req.getContextPath()+"error.jsp");
		}
	}
	public void delete(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
		int id = Integer.parseInt(req.getParameter("id"));
		int rows =userService.deleteUserById(id);
		if(rows>0){
			resp.sendRedirect(req.getContextPath()+"/index.jsp");
		}else{
			resp.sendRedirect(req.getContextPath()+"error.jsp");
		}
		
	}
	public void update(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
		int id = Integer.parseInt(req.getParameter("id"));
		User user = userService.get(id);
		req.setAttribute("user", user);//把封装好的对象放到req的属性空间里面
		req.getRequestDispatcher("/update.jsp").forward(req, resp);;//把封装好的对象注入到jsp页面
	}
	/**
	 * 实现首页的模糊查询
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	public void query(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
		//解决中文乱码问题 设置字符集
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		String username = req.getParameter("username");
		String address = req.getParameter("address");
		String phoneNo =req.getParameter("phoneNo");
		List<User>list =userService.query(username,address,phoneNo);
		req.setAttribute("userlist", list);//把结果集放到req的属性空间里面 
		req.getRequestDispatcher("/index.jsp").forward(req, resp);//把整个req,resp注入到jsp页面
	}
}
