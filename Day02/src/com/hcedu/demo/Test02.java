package com.hcedu.demo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("================================");
		System.out.println("欢迎使用员工管理系统");
		System.out.println("================================");
		String loginname [] = {"zhangsan","lisi","wangwu","xiaoli"};
		String loginpassword [] = {"123","321","123456","456123"};
		String ID []= {"001","002","003","004"};
		int age []= {10,20 ,25 ,30 ,35};
		String youxiang[] = {"aaa","bbb","ccc","ddd"};
		String adress [] = {"四川","北京","重庆","湖南"};
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

	  int x=0;
	  Scanner sc= new Scanner(System.in);
      while (true) 
	       {
	           System.out.println("请选择业务");
	           System.out.println("--------------------员工管理系统--------------------");
	           System.out.println("1.添加    2.删除    3.修改    4.查询所有    5.根据姓名查询    0.退出");
	           System.out.println("--------------------员工管理系统--------------------");
	           x = sc.nextInt();
	           if (x == 1) {
	              add();
	           } else if (x == 2) {
	             // del();
	           } else if (x == 3) {
	             // update();
	           } else if (x == 4) {
	             // selectAll();
	           } else if (x == 5) {
	             // selectName();
	           } else if (x == 0) {
	              //exit();
	              break;
	           } else {
	              System.out.println("请选择正确的功能");
	           }
	       }
	
	}
	public  static void add()
	{
		System.out.println("=========增加员工==========");
		String loginname [] = {"zhangsan","lisi","wangwu","xiaoli"};
		System.out.print("请输入员工姓名：");
		Scanner input = new Scanner(System.in);
		String Name=input.next();
			List<String> list = new ArrayList<String>();
			list.add("北京");
			list.add("上海");
			String[] array = new String[list.size()];
			array = list.toArray(array);
			for (String s : array) {
			System.out.println(s);
			}
			}
		/*String result [] = new String[loginname.length+1];
		for(int i = 0 ;i<loginname.length;i++)
		{
		
			result[i]=loginname[i];
		}
		
		result[loginname.length]=Name;
		System.out.println(result);*/
			

	public void del()
	{
		
	}
    
}
