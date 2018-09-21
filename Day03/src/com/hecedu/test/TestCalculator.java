package com.hecedu.test;
import java.util.Scanner;

import org.junit.Test;
import com.hecedu.demo.Calculator;

public class TestCalculator {
    @Test
   public void t02() {
    	Calculator  calculator = new Calculator();
    	Scanner sc = new Scanner(System.in);
    	System.out.println("请输入两个数：");
    	double num1=sc.nextDouble();
    	double num2=sc.nextDouble();
    	System.out.println("请输入执行方法：");
    	String operate = sc.next();
    	calculator.setNum1(num1);
    	calculator.setNum2(num2);
    	calculator.setOperat(operate);
    	System.out.println(calculator.operation(num1,num2,operate));
    }
}
