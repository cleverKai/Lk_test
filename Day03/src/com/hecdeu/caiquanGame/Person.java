package com.hecdeu.caiquanGame;

import java.util.Scanner;

public class Person {
	private int score;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	public int start() {
		System.out.println("�������ȭ���ͣ�1.���� 2.ʯͷ 3.��");
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
   /*private String name;
   private String operate;
   private int score;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getOperate() {
	return operate;
}
public void setOperate(String operate) {
	this.operate = operate;
}
public int getScore() {
	return score;
}
public void setScore(int score) {
	this.score = score;
}
   public int showFist() {
	   Scanner input = new Scanner(System.in);
	   System.out.println("\n���ȭ��1.���� 2.ʯͷ 3.��(������Ӧ����):");
	   int show = input.nextInt();
	   switch(show) {
	   case 1:
		   System.out.println("��ҳ�ȭ������");
		   break;
	   case 2:
		   System.out.println("��ҳ�ȭ��ʯͷ");
		   break;
	   case 3:
		   System.out.println("��ҳ�ȭ����");
	       break;
	       default:
	    	   System.out.println("�Ƿ�������������ѡ��");
	   }
	   return show;
   }
   */
}
