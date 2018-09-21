package cn.mvcproject.dao;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import cn.mvcproject.utils.JdbcUtils;

/**
 * 这是Dao层里面的一个基本类，被具体的Dao类（userdao）继承,不能被直接用 new BaseDao()
 * @author Administrator
 *
 * @param <T>:针对要操作各种数据表映射到java工程里面的类
 */
public class BaseDao<T> {
	
	QueryRunner queryRunner = new QueryRunner();
	private Class<T> clazz;
	@SuppressWarnings("unchecked")
	public BaseDao(){
		Type superType = this.getClass().getGenericSuperclass();
		if(superType instanceof ParameterizedType){
			ParameterizedType pt = (ParameterizedType) superType;
			Type [] tarry = pt.getActualTypeArguments();
			if(tarry[0] instanceof Class){
				clazz = (Class<T>) tarry[0] ;
				
			}
		}
	}


   //对数据库有增删改查
	/**
	 * 查询数据表 ，用于返回数据库结果集的第一条
	 * null 位置是传入BaseDao<T>里面T的真正用用的时候的类型Class
	 * @param sql
	 * @param args
	 * @return
	 */
	public T get(String sql,Object... args){   //占位符
		Connection connection = null;
		T entity = null;
		try {
			//拿到conn
			connection = JdbcUtils.getConnection();
			entity = queryRunner.query(connection, sql, new BeanHandler<T>(clazz), args);
		} catch (Exception e) {
		   e.printStackTrace();
		}finally{
			JdbcUtils.closeconn(connection);
		
	    }
		return entity;
}

		/**
		 * 查询数据表 ，用于返回数据库结果集的第一条
		 * @param sql
		 * @param args
		 * @return
		 */
		public T get(Connection connection,String sql,Object... args){   //占位符
			T entity = null;
			try {
				entity = queryRunner.query(connection, sql, new BeanHandler<T>(clazz), args);
			} catch (Exception e) {
			   e.printStackTrace();
			}
			return entity;
		}
		/**
		 * 获取多条记录的通用方法 ，利用泛型实现通用
		 * @return
		 */
		
		public List<T> getList(String sql,Object...args){
			Connection connection = null;
		     List<T> list = null;
			try {
				//拿到conn
				connection = JdbcUtils.getConnection();
				list = queryRunner.query(connection, sql,new BeanListHandler<>(clazz), args);
			} catch (Exception e) {
			   e.printStackTrace();
			}finally{
				JdbcUtils.closeconn(connection);
			
		    }
			
			return list;
			
		}
		/**
		 * 获取影响记录的条数的通用方法：insert delete update
		 * @param sql
		 * @param args
		 * @return
		 */
		 public int update(String sql,Object...args){
			 Connection connection = null;
			 int rows = 0;
			try {
				//拿到conn
				connection = JdbcUtils.getConnection();
				rows = queryRunner.update(connection, sql, args);
			} catch (Exception e) {
			   e.printStackTrace();
			}finally{
				JdbcUtils.closeconn(connection);
			
		    }
			
			return rows;
			 
		 }
		 /**
		  * 通用的返回sql语句的结果只有一个数值的类型的查询，用户个数
		  * @param sql
		  * @param args
		  * @return
		  */
		 public  Object getValue(String sql,Object...args){
			 
			 Connection connection = null;
			 Object obj = null;
			try {
				//拿到conn
				connection = JdbcUtils.getConnection();
				obj = queryRunner.query(connection, sql, new ScalarHandler(), args);
			} catch (Exception e) {
			   e.printStackTrace();
			}finally{
				JdbcUtils.closeconn(connection);
			
		    }
			
			return obj;
			  
			 
		 }
		 
}
	

