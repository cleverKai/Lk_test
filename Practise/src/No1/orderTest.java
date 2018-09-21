package No1;

import java.security.KeyStore.Entry;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class orderTest {
    static Scanner  scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("*********欢迎使用订单管理系统************");
		while(true){
			System.out.println("请选择操作：1、展示订单列表\t2、新增订单\t3、修改订单\t4、删除订单\t5、退出系统");
			System.out.print("请选择序号：");
			int num = scanner.nextInt();
			switch (num) {
			case 1:
				showList();
				break;
            case 2:
				addOrder();
				break;
            case 3:
	             updateOrder();
	            break;
            case 4:
	            delOrder();
	            break;
            case 5:
	            System.out.println("系统退出成功！");
	            return;

			default:
				System.out.println("序号输入有误！");
				break;
			}
			
		}
	}
	public static void showList(){
		LinkedHashMap<Integer, Order> map = OrderManager.showOrderList();
		Set<java.util.Map.Entry<Integer, Order>> set = map.entrySet();
		System.out.println("序号\t订单名\t订单价格");
		for (java.util.Map.Entry<Integer, Order> entry : set) {
			Order order = entry.getValue();
			System.out.println(order.getId()+"\t"+order.getName()+"\t"+order.getPrice());
			
		}
	}
	public static void addOrder() {
		System.out.print("请输入订单ID：");
		int id = scanner.nextInt();
		System.out.print("请输入订单名：");
		String name = scanner.next();
		System.out.print("请输入订单价格：");
		double price = scanner.nextDouble();
		Order order = new Order(id, name, price);
	    boolean	isok =OrderManager.addOrder(order);
	    if(isok){
	    	System.out.println("新增数据成功！");
	    	showList();
	    
	    }else{
	    		System.out.println("订单ID已存在，请重新录入！");
	    	}
	    	
	    }
	public static void  delOrder() {
		System.out.print("请选择要删除的订单编号：");
		int id = scanner.nextInt();
		boolean isok = OrderManager.delOrder(id);
		if(isok){
			System.out.println("订单删除成功！");
			showList();
		}else{
			System.out.println("抱歉，你的ID无法找到相应数据！");
		}
	}
		
	public static void  updateOrder() {
		System.out.print("请输入订单ID：");
		int id = scanner.nextInt();
		System.out.print("请输入订单名：");
		String name = scanner.next();
		System.out.print("请输入订单价格：");
		double price = scanner.nextDouble();
		Order order = new Order(id, name, price);
	    boolean	isok =OrderManager.updateOrder(order);
	    if(isok){
	    	System.out.println("订单修改成功！");
	    	showList();
	    }else{
	    	System.out.println("抱歉 你的ID不存在无法修改！");
	    	
	    }
	}
	
	
	}


