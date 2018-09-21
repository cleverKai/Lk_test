package com.hecedu.demo;

import java.util.Scanner;

public class Calculator {
	private double num1,num2;
	private String operat;
	
    public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public String getOperat() {
		return operat;
	}

	public void setOperat(String operat) {
		this.operat = operat;
	}
	 public static double operation(double num1 , double num2 ,String type)  
     {
 	   double result = 0;
 	   switch(type)
 	   {
 	   case "+":
 		   result=num1+num2;
 		   break;
 	   case "-":
 		   result=num1-num2;
 		   break;
 	   case "*":
 		   result=num1*num2;
 		   break;
 	   case "/":
 		   result=num1/num2;
 		   break;
 	   
 	   default:
 		 System.out.println("·Ç·¨²Ù×÷£¡");
 		 break;
 	   }
    return result;
    
}
    
}
