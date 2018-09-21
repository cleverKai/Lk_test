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
		System.out.println("请输入出拳类型：1.剪刀 2.石头 3.布");
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
	   System.out.println("\n请出拳：1.剪刀 2.石头 3.布(输入相应数字):");
	   int show = input.nextInt();
	   switch(show) {
	   case 1:
		   System.out.println("玩家出拳：剪刀");
		   break;
	   case 2:
		   System.out.println("玩家出拳：石头");
		   break;
	   case 3:
		   System.out.println("玩家出拳：布");
	       break;
	       default:
	    	   System.out.println("非法操作，请重新选择：");
	   }
	   return show;
   }
   */
}
