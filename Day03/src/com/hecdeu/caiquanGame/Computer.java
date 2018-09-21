package com.hecdeu.caiquanGame;

public class Computer {
	private int score;

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	public int start() {
		return (int)(Math.random()*3+1);	
	}
	/*private String operate;
	private int score;
	private String name;
	
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
		int show = (int)(Math.random()*10)%3+1;
		switch(show) {
		 case 1:
			 System.out.println(name+"出拳:剪刀");
		     break;
		 case 2:
			 System.out.println(name+"出拳：石头");
			 break;
		 case 3:
			 System.out.println(name+"出拳：布");
			 break;
		}
		return show;
    }*/
}
