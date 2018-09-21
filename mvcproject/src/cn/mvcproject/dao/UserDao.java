package cn.mvcproject.dao;


import java.util.List;

import cn.mvcproject.model.User;

/**
 * 借口制定规则，只是定义方法二不用实现，UserDao定义与users数据表有关操作的方法
 * @author Administrator
 *
 */
public interface UserDao {
	/**
	 * 实现插入一条新用户的数据
	 * @param user
	 * @return
	 */
	public int  save(User user);
	/**
	 * 根据用户编号 删除用户
	 * @param id
	 * @return
	 */
	public int deleteUserById(int id);
	/**
	 * 根据用户编号改变用户数据
	 * @param id
	 * @return
	 */
	public int updateUserByID(User user);
	/**
	 * 根据用户id获取一条用户信息，封装成一个User的一个对象实例
	 * @param id
	 * @return
	 */
	public User get(int id);
	/**
	 * 根据用户id获取所有用户信息
	 * @return
	 */
	public List<User> getListAll();
	/**
	 * 查看指定用户名的用户有多少
	 * @param Name
	 * @return
	 */
	public  long getCountByName(String Name);
	
	/**
	 * dao层实现模糊查询
	 * @param username
	 * @param address
	 * @param phoneNo
	 * @return
	 */
	public List<User> query(String username, String address, String phoneNo);
		
	
		
	

}
