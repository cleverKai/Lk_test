package com.work.demo;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ����Ա��������Ϣ
		 */
		Scanner s = new Scanner(System.in);
		System.out.print("Ա����ţ�");
		int ID = s.nextInt();
		System.out.print("Ա��������");
		String Name = s.next();
		System.out.print("Ա������ ��");
		int Age = s.nextInt();
		System.out.print("Ա�����䣺");
		String Email =s.next();
		System.out.print("Ա����ַ:");
		String Address = s.next();
		System.out.print("Ա���Ա�");
		String sex = s.next();
		System.out.println();
		System.out.println("Ա����ţ�"+ID);
		System.out.println("Ա��������"+Name);
		System.out.println("Ա�����䣺"+Age);
		System.out.println("Ա�����䣺"+Email);
		System.out.println("Ա����ַ��"+Address);
		System.out.println("Ա���Ա�"+sex);  
	}

}
