package com.hcedu.demo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("================================");
		System.out.println("��ӭʹ��Ա������ϵͳ");
		System.out.println("================================");
		String loginname [] = {"zhangsan","lisi","wangwu","xiaoli"};
		String loginpassword [] = {"123","321","123456","456123"};
		String ID []= {"001","002","003","004"};
		int age []= {10,20 ,25 ,30 ,35};
		String youxiang[] = {"aaa","bbb","ccc","ddd"};
		String adress [] = {"�Ĵ�","����","����","����"};
		Scanner s = new Scanner(System.in);
		int logincount=0;
		boolean pass=false;
		do {
			System.out.println("�������û�����");
			String name = s.next();
			System.out.println("���������룺");
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
				System.out.println("���������㻹��"+(3-logincount)+"�λ���");
			}
		}while(!pass);
		if(pass)
		{
			System.out.println("��¼�ɹ���");
		}
		else
		
			System.out.println("��¼ʧ�ܣ�");

	  int x=0;
	  Scanner sc= new Scanner(System.in);
      while (true) 
	       {
	           System.out.println("��ѡ��ҵ��");
	           System.out.println("--------------------Ա������ϵͳ--------------------");
	           System.out.println("1.���    2.ɾ��    3.�޸�    4.��ѯ����    5.����������ѯ    0.�˳�");
	           System.out.println("--------------------Ա������ϵͳ--------------------");
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
	              System.out.println("��ѡ����ȷ�Ĺ���");
	           }
	       }
	
	}
	public  static void add()
	{
		System.out.println("=========����Ա��==========");
		String loginname [] = {"zhangsan","lisi","wangwu","xiaoli"};
		System.out.print("������Ա��������");
		Scanner input = new Scanner(System.in);
		String Name=input.next();
			List<String> list = new ArrayList<String>();
			list.add("����");
			list.add("�Ϻ�");
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
