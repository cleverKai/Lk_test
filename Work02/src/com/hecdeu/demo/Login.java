package com.hecdeu.demo;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("================================");
		System.out.println("��ӭʹ��Ա������ϵͳ");
		System.out.println("================================");
		String loginname [] = {"zhangsan","lisi","wangwu","xiaoli"};
		String loginpassword [] = {"123","321","123456","456123"};
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

	}

}
