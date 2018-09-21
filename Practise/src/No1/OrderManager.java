package No1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashMap;
import java.util.Map;

public class OrderManager {
	private static  LinkedHashMap<Integer, Order> map = new LinkedHashMap<Integer, Order>();
	/**
	 * 读取订单文件
	 * 
	 */
	static{
		try {
			FileInputStream fis = new FileInputStream("data/order.txt");
			try {
				if(fis.read()==-1){
				writeData(map);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	public static void  readData() {
		ObjectInputStream ooS = null;
		try {
			ooS = new ObjectInputStream(new FileInputStream("data/order.txt"));
			map =(LinkedHashMap<Integer, Order>) ooS.readObject();
		} catch (FileNotFoundException e) {	
			e.printStackTrace();
		} catch (IOException e) {		
			e.printStackTrace();
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
		
	}
	/**
	 * 写入订单文件
	 * 
	 */
	public static  void  writeData( LinkedHashMap<Integer, Order> map) {
		ObjectOutputStream oos= null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("data/order.txt"));
			oos.writeObject(map);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * 新增订单
	 * @return 
	 */
	public static boolean addOrder(Order order) {
		readData();
		if(map.containsKey(order.getId())){
			return false;
		}
		map.put(order.getId(), order);
		writeData(map);
		return true;
		
	}
	/**
	 * 展示订单列表
	 */
	public static LinkedHashMap<Integer, Order> showOrderList() {
		// TODO Auto-generated method stub
		readData();
		return map;
	}

	/**
	 * 删除订单
	 */
	public static boolean delOrder(int id) {
		readData();
		if(!map.containsKey(id)){
			return false;
			
		}
		map.remove(id);
		writeData(map);
		return true;
	}
	/**
	 * 修改订单
	 */

	public static boolean updateOrder(Order order) {
		readData();
		if(!map.containsKey(order.getId())){
			return false;	
		}
		map.put(order.getId(), order);
		writeData(map);
		return true;
	}
    /**
     * 系统退出
     */
}
