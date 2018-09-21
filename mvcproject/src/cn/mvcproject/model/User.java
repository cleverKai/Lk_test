package cn.mvcproject.model;

import java.util.Date;
  /**
   * 用户类
   * @author Administrator
   *
   */
public class User  {
	/**
	 * 用户的编号
	 */
	private int id ;
	/**
	 * 用户的名称
	 */
	private String username;
	/**
	 * 用户的密码
	 */
	private String pasword;
	/**
	 * 用户的电话号码
	 */
	private String phoneNo;
	/**
	 * 用户的地址
	 */
	private String address;
	/**
	 * 用户的注册日期
	 */
	private Date regDate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String username, String pasword, String phoneNo,
			String address, Date regDate) {
		super();
		this.id = id;
		this.username = username;
		this.pasword = pasword;
		this.phoneNo = phoneNo;
		this.address = address;
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", pasword="
				+ pasword + ", phoneNo=" + phoneNo + ", address=" + address
				+ ", regDate=" + regDate + "]";
	}
	

}
