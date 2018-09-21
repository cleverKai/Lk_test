package com.hcedu.demo;
import java.util.Random;
import java.util.*;
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //定义存储成绩的数组
		// int [] score = new int[62];
		int [] studentID = {1,2,3,4,5,6,7,8,9};
		//System.out.println(score[0]);
		/*for(int i=0;i<score.length;i++)
		{
			System.out.println(score[i]);
		}*/
		/*int temp = 0;
		for(int i=1;i<score.length;i++)
		{
			for(int j=0;j<score.length-1;j++)
			{
				if(score[j]>score[j+1])
				{
				temp=score[j];
				score[j]=score[j+1];
				score[j+1]=temp;
				}
			}
		}
		for(int k=0;k<score.length;k++)
		{
		 	System.out.println(score[k]);
		}
		*/ 
		
		String name []= {"a","b","c","d","e","f","g"};
		while(name.length>0)
		{
			System.out.println("按下enter键，抓阄："); 
			Scanner input = new Scanner(System.in);
			input.nextLine();
			//随机生成索引
			int index = (int)(Math.random()*name.length);
			System.out.println(name[index]+"被抓");
			for(int i=index; i<name.length-1;i++)
			{
				name[i]=name[i+1];
			}
			//定义一个新数组，其长度为name.length-1
			String [] temp = new String[name.length-1];
			for(int i=0;i<temp.length;i++)
			{
				temp[i]=name[i];
			}
			name=temp;
		}
		
		
		
	}

	
}
	