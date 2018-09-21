package No1;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num = 0;
        int letter = 0;
        int space = 0;
        int others = 0;
        System.out.print("请输入一段字符串：");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        char[]arr = string.toCharArray();
        for(int i = 0; i<arr.length;i++){
        	if(arr[i]>=48&&arr[i]<=57){
        		num++;
        	}else if((arr[i]>=65&&arr[i]<=90)||(arr[i]>=97&&arr[i]<=122)){
        		letter ++;
        	}else if(arr[i] == 32){
        		space++;
        	}else {
        		others++;
        	}
        }
      System.out.println("数字："+num+"字母："+letter+"空格"+space+"其他"+others);
      scanner.close();
	}

}
