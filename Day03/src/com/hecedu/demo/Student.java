package com.hecedu.demo;

public class Student extends Human {
	public Student (String name,int age) {
		super(name,age);
	} 
	@Override
	public void eat() {
		System.out.println("ѧ��ϲ����ʳ��");
	}
  @Override
  public void work() {
	  System.out.println("ѧ���Ĺ�����ѧϰ");
  }
}
