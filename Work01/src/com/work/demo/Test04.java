package com.work.demo;
import java.util.Scanner;
public class Test04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��������������");
         Scanner sc = new Scanner(System.in);
         double a = sc.nextDouble();
         double b = sc.nextDouble();
         System.out.println("��������������:");
         String type = sc.next();
         double result = 0;
         System.out.println("������Ϊ��"+operation( a ,  b , type));
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
       
    	   
       
       
	


