package com.hecedu.demo;
import javax.swing.plaf.synth.SynthStyle;
/*
 * 封装
 */
public class Human {
	public String name;
	public int age;
	public Human() {//构造方法
		
	}
	public Human(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void setName() {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void eat(String name) {
		System.out.println(name+"吃饭");
		
	}
	public void sleep(String adress) {
		System.out.println(name+"去"+adress+"睡觉");
	}
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	public void work() {
		System.out.println("学生的工作时学习");
	}
}
 