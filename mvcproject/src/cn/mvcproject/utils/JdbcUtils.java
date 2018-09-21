package cn.mvcproject.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
/**
 * jdbc工具类
 * @author Administrator
 *
 */
public class JdbcUtils {
	/**
	 * 获取到数据库连接对象conn
	 * @return
	 */
	/**
	 * 数据库连接池 ：c3p0
	 * @return
	 */
	public static DataSource dataSource = null;
	static{ //静态块只会被执行一次
		dataSource = new ComboPooledDataSource("mysql");//拿到数据库连接池对象
	}
	
	
	public static Connection getConnection(){
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	/**
	 * 通用关闭数据库连接对象
	 * @param connection
	 */
	public static void  closeconn(Connection connection){
		if(connection!=null){
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	

}
