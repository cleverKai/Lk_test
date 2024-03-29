package cn.mvcproject.dao;

import java.util.List;

import javax.print.DocFlavor.STRING;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import cn.mvcproject.model.User;

public class UserDaoImpl extends BaseDao<User> implements  UserDao {

	@Override
	public int save(User user) {
        String sql = "insert into users(username,pasword,phone_no,address,reg_date)values(?,?,?,?,?)";
         return super.update(sql, user.getUsername(),user.getPasword(),user.getPhoneNo(),user.getAddress(),user.getRegDate());
		
	}

	@Override
	public int deleteUserById(int id) {
		String sql = "delete from users where id=? ";
		  return super.update(sql, id);
	}

	@Override
	public int updateUserByID(User user) {
		String sql = "update users set username=?,pasword=?,phone_no=?,adress=? where id = ? ";
		 return super.update(sql, user.getUsername(),user.getPasword(),user.getPhoneNo(),user.getAddress(),user.getId());
	}

	@Override
	public User get(int id) {
		String  sql = "select `id`,`username`,`pasword`,`phone_no` phoneNo,`address`,`reg_date` reg_Date from `users` where id=?;";
		return super.get(sql, id);
	}

	@Override
	public List<User> getListAll() {
		String sql="select `id`,`username`,`pasword`,`phone_no` phoneNo,`address`,`reg_date` reg_Date from `users`";
		 return super.getList(sql);
	}

	@Override
	public long getCountByName(String username) {
		String sql = "select count(id) from users where username=?";
		return (long) super.getValue(sql, username);
	}

	@Override
	public List<User> query(String username, String address, String phone_No) {
		String sql = "select `id`,`username`,`pasword`,`phone_no` phoneNo,`address`,`reg_date` reg_Date from `users` where 1=1";
		if(username !=null && !"".equals(username)){
			sql = sql + " and username like '%"+username+"%'";
		}
		if(address !=null && !"".equals(address)){
			sql = sql + " and address like '%"+address+"%'";
		}
		if(phone_No !=null &&  !"".equals(phone_No)){
			sql = sql + " and phone_no like '%"+phone_No+"%'";
		}
		return super.getList(sql);
	}

}
