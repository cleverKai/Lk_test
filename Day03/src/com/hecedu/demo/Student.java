package com.hecedu.demo;

public class Student extends Human {
	public Student (String name,int age) {
		super(name,age);
	} 
	@Override
	public void eat() {
		System.out.println("学生喜欢吃食堂");
	}
  @Override
  public void work() {
	  System.out.println("学生的工作是学习");
  }
}
