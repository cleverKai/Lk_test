package com.hecdeu.caiquanGame;

import java.util.Scanner;

public class Game {
	public void gameStart() {
		Scanner input = new Scanner(System.in);
		Person p = new Person();
		Computer c= new Computer();
		String flag="Y";
		while("Y".equals(flag)) {
			int a = p.start();
			int b = c.start();
			System.out.println("���Գ�ȭ:"+b+"��ҳ�ȭ:"+a);
			if(a==1&&b==2||a==2&&b==3||a==3&&b==1) {
				System.out.println("����Ӯ�ˣ����Ե�һ�֣�");
				c.setScore(c.getScore()+1);
				//System.out.println("���ڵıȷ֣�����"+c.getScore()+"���"+p.getScore());
			}else if(a==b) {
				System.out.println("��ƽ�ˣ������÷�");
			}else {
				System.out.println("���Ӯ�ˣ���Ҽ�һ��");
				p.setScore(p.getScore()+1);
			}
				System.out.println("���ڵıȷ֣�����:"+c.getScore()+"���:"+p.getScore());
				System.out.println("�Ƿ������Y/N��");
				 flag = input.next();
		   }
			
		System.out.println("��Ϸ������");
		
	}
	
  
}
