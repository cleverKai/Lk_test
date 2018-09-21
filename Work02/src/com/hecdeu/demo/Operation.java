package com.hecdeu.demo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Operation {
	private static Scanner sc;
	public static void main(String[] args) {
		showMenu();
		List<Employee> list=new ArrayList<Employee>();//初始化一个员工集合；
		while(true){
			System.out.print("请选择操作：");
			sc=new Scanner(System.in);
			String item=sc.nextLine();
			switch (item) {
			case "1":
				add(list);   //增加
				break;
			case "2":
				remove(list);//删除
				break;
			case "3":
				update(list);  //修改
				break;		
			case "4":
				select(list);//查找
				break;
			case "5":		
				showAll(list);	//浏览
				break;
			case "0":
				System.out.println("\t退出成功！");
				System.exit(0);
			default:
				System.out.println("输入错误，请重新选择！");
				break;
			}
		}
		
	}
	
	//查询 方法 ；
	
	private static void select(List<Employee> list) {
		System.out.println("\t【查询员工】");
		System.out.print("\t请输入待查询工号：");
		String id=sc.nextLine();
		int index=0;
		boolean bool=false;
		for (Object object : list) { 
			Employee emp=(Employee)object;
			if(Integer.parseInt(id)==emp.getId()){
				index=list.indexOf(emp);
				bool=true;
				System.out.println("\t请稍候...");
				System.out.println("\t"+emp.getId()+"\t"+emp.getName()+"t"+emp.getAge()+"\t"+emp.getEmail()+"\t"+emp.getAddress());
			}
		}
		if(bool) {
			System.out.println("\t查询成功！");
			
		} else{
			System.out.println("\t请输入正确的工号：");
		}
	}
 
	//删除 员工方法  ：
	private static void remove(List<Employee> list) {
		System.out.println("\t【删除员工】");
		System.out.print("\t请输入原来工号：");//利用员工编号进行删除员工信息
		String oldId=sc.nextLine();
/*		//System.out.print(id);
		System.out.print("\t请输入原来姓名：");//也可用员工的名字删除员工信息
*/
		int index=0;
		boolean bool=false;
		for (Object object : list) { 
			Employee emp=(Employee)object;
			if(Integer.parseInt(oldId)==emp.getId()){
				index=list.indexOf(emp);
				bool=true;
			}
		}
		if(bool) {
			list.remove(index);
			System.out.println("\t删除成功！");
		} else{
			System.out.println("\t请输入正确的工号：");
		}
	}
	
	// 浏览员工方法
	private static void showAll(List<Employee> list) {
		System.out.println("\t工号\t姓名\t年龄\t邮箱\t\t地址");
		for (Object object : list) {
			Employee emp=(Employee)object;
			System.out.println("\t"+emp.getId()+"\t"+emp.getName()+"\t"+emp.getAge()+"\t"+emp.getEmail()+"\t"+emp.getAddress());
		}
	}
	
	// 增加 员工方法 ：
	private static void add(List<Employee> list) {
		System.out.println("\t【增加员工】");
		System.out.print("\t请输入员工号：");
		String id=sc.nextLine();
		System.out.print("\t请输入姓名:");
		String name=sc.nextLine();
		System.out.print("\t请输入年龄:");
		String age =sc.nextLine();
		System.out.print("\t请输入邮箱:");
		String email=sc.nextLine();
		System.out.print("\t请输入地址:");
		String address=sc.nextLine();
		list.add(new Employee(Integer.parseInt(id),name,Integer.parseInt(age) ,email,address));//增加员工信息
		System.out.println("\t增加成功！");
	}
	
	//  修改员工 方法  
	private static void update(List<Employee> list) {
		System.out.println("\t【修改员工】");
		System.out.print("\t请输入原来员工号：");
		String oldId=sc.nextLine();
		int index=0;
		boolean bool=false;
		for (Object object : list) { 
			Employee emp=(Employee)object;
			if(Integer.parseInt(oldId)==emp.getId()){
				index=list.indexOf(emp);
				System.out.println("\t请稍候..."); 
				bool=true;    // 验证 员工号。
			}
		}
		if(bool) {
			System.out.print("\t请输入新的员工号：");
			String id=sc.nextLine();
			System.out.print("\t请输入新的姓名：");
			String name=sc.nextLine();
			System.out.print("\t请输入新的年龄：");
			String age=sc.nextLine();
			System.out.print("\t请输入新的邮箱：");
			String email=sc.nextLine();
			System.out.print("\t请输入新的地址：");
			String address=sc.nextLine();
			list.set(index,new Employee(Integer.parseInt(id),name,Integer.parseInt(age),email,address));
			System.out.println("\t修改成功！");
		} else {
			System.out.println("\t请输入正确的员工号：");
		}
	}
	public static void showMenu() {
		System.out.println("========================");
		System.out.println("欢迎使用员工管理系统");
		System.out.println("========================");
		System.out.println("功能列表:");
		System.out.println("【1】增加员工信息");
		System.out.println("【2】删除员工信息");
		System.out.println("【3】修改员工信息");
		System.out.println("【4】查询员工信息");
		System.out.println("【5】浏览员工信息");
		System.out.println("【0】退出系统");
		System.out.println("========================");
		
	}

	}

