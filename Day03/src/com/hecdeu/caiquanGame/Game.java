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
			System.out.println("电脑出拳:"+b+"玩家出拳:"+a);
			if(a==1&&b==2||a==2&&b==3||a==3&&b==1) {
				System.out.println("电脑赢了，电脑得一分！");
				c.setScore(c.getScore()+1);
				//System.out.println("现在的比分：电脑"+c.getScore()+"玩家"+p.getScore());
			}else if(a==b) {
				System.out.println("打平了，都不得分");
			}else {
				System.out.println("玩家赢了，玩家加一分");
				p.setScore(p.getScore()+1);
			}
				System.out.println("现在的比分：电脑:"+c.getScore()+"玩家:"+p.getScore());
				System.out.println("是否继续（Y/N）");
				 flag = input.next();
		   }
			
		System.out.println("游戏结束！");
		
	}
	
  
}
