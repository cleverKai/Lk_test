package com.hecdeu.demo;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("================================");
		System.out.println("欢迎使用员工管理系统");
		System.out.println("================================");
		String loginname [] = {"zhangsan","lisi","wangwu","xiaoli"};
		String loginpassword [] = {"123","321","123456","456123"};
		Scanner s = new Scanner(System.in);
		int logincount=0;
		boolean pass=false;
		do {
			System.out.println("请输入用户名：");
			String name = s.next();
			System.out.println("请输入密码：");
			String password = s.next();
			for(int i =0;i<loginname.length;i++)
			{
				if(name.equals(loginname[i])&&password.equals(loginpassword[i]))
				{
				pass = true;
				break;
				}
			}
			if(!pass)
			{
				logincount++;
				if(logincount==3)
				{
					break;
				}
				System.out.println("输入有误，你还有"+(3-logincount)+"次机会");
			}
		}while(!pass);
		if(pass)
		{
			System.out.println("登录成功！");
		}
		else
		
			System.out.println("登录失败！");

	}

}
