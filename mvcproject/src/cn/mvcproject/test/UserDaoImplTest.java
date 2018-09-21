package cn.mvcproject.test;

import static org.junit.Assert.*;

import org.junit.Test;
import cn.mvcproject.dao.UserDao;
import cn.mvcproject.dao.UserDaoImpl;
import cn.mvcproject.model.User;

public class UserDaoImplTest {
	
	UserDao userDAO = new UserDaoImpl();

	@Test
	public void testGetInt() {
	User user = userDAO.get(2);
	System.out.println(user);
	}

}
