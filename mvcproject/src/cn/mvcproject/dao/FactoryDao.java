package cn.mvcproject.dao;

public class FactoryDao {
	public static UserDao userDao(){
		return new UserDaoImpl();
	}

}
