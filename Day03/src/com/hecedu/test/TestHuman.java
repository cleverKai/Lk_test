package com.hecedu.test;

import org.junit.Test;

import com.hecedu.demo.Human;

public class TestHuman {
	/*public static void main(String[] args) {
		Human human = new Human();
		human.name="chenwei";
		human.eat();
				
	}*/
	@Test
	public void t01() {
		Human human = new Human("xiaoli",15);
		human.sleep("วÞสา");
		human.setName();
		human.eat("likai");
	}

}
