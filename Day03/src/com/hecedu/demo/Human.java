package com.hecedu.demo;
import javax.swing.plaf.synth.SynthStyle;
/*
 * ��װ
 */
public class Human {
	public String name;
	public int age;
	public Human() {//���췽��
		
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
		System.out.println(name+"�Է�");
		
	}
	public void sleep(String adress) {
		System.out.println(name+"ȥ"+adress+"˯��");
	}
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	public void work() {
		System.out.println("ѧ���Ĺ���ʱѧϰ");
	}
}
 