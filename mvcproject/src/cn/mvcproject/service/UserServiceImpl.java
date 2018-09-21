package cn.mvcproject.service;

import java.util.List;

import com.sun.org.apache.bcel.internal.generic.FRETURN;

import cn.mvcproject.dao.FactoryDao;
import cn.mvcproject.dao.UserDao;
import cn.mvcproject.model.User;

public class UserServiceImpl implements UserService {
	
	UserDao userDao = FactoryDao.userDao();

	@Override
	public int save(User user) {
		
		return userDao.save(user);
	}

	@Override
	public int deleteUserById(int id) {
		return userDao.deleteUserById(id);
	}

	@Override
	public int updateUserByID(User user) {
		return userDao.updateUserByID(user);
	}

	@Override
	public User get(int id) {
		return userDao.get(id);
	}

	@Override
	public List<User> getListAll() {
		return userDao.getListAll();
	}

	@Override
	public long getCountByName(String Name) {
		return userDao.getCountByName(Name);
	}

	@Override
	public List<User> query(String username, String address, String phoneNo) {
		
		return userDao.query(username,address,phoneNo);
	}

}
