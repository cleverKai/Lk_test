package com.work.demo;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 输入员工个人信息
		 */
		Scanner s = new Scanner(System.in);
		System.out.print("员工编号：");
		int ID = s.nextInt();
		System.out.print("员工姓名：");
		String Name = s.next();
		System.out.print("员工年龄 ：");
		int Age = s.nextInt();
		System.out.print("员工邮箱：");
		String Email =s.next();
		System.out.print("员工地址:");
		String Address = s.next();
		System.out.print("员工性别：");
		String sex = s.next();
		System.out.println();
		System.out.println("员工编号："+ID);
		System.out.println("员工姓名："+Name);
		System.out.println("员工年龄："+Age);
		System.out.println("员工邮箱："+Email);
		System.out.println("员工地址："+Address);
		System.out.println("员工性别："+sex);  
	}

}
