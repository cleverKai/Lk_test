package com.hecdeu.demo;
public class Employee {
	private int id;
	private String name;
	private int age;
	private String email;
	private String address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge() {
		this.age=age;
	}
	public String getEmail() {
		return email;
	}
	public void steEmail() {
		this.email=email;
	}
	public Employee(int id, String name,int age,String email,String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.email=email;
		this.address=address;
	}
	@Override
	public String toString() {
		return "Employee [Ա����id=" + id + ", ���� name=" + name + ",����age="+ age+ ",����email="+email +"address="+address+"]";
	}
	
}

