package com.hecedu.test;

import org.junit.Test;

import com.hecedu.demo.Student;

public class TestStudent {
	@Test
	public void t01() {
		Student student = new Student("xiaoli", 20);
		student.eat("likai");
		student.work();
	}

}
