package com.work.demo;
import java.util.Scanner;
public class Test04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入两个数：");
         Scanner sc = new Scanner(System.in);
         double a = sc.nextDouble();
         double b = sc.nextDouble();
         System.out.println("请输入运算类型:");
         String type = sc.next();
         double result = 0;
         System.out.println("运算结果为："+operation( a ,  b , type));
	} 
        public static double operation(double a , double b ,String type)  
        {
    	   double result = 0;
    	   switch(type)
    	   {
    	   case "+":
    		   result=a+b;
    		   break;
    	   case "-":
    		   result=a-b;
    		   break;
    	   case "*":
    		   result=a*b;
    		   break;
    	   case "/":
    		   result=a/b;
    		   break;
    	   }
       return result;
       
   }
}
       
    	   
       
       
	


