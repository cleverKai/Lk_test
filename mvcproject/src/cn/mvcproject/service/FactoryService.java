package cn.mvcproject.service;

import org.omg.CORBA.PUBLIC_MEMBER;

public class FactoryService {
	public static UserService getUserService(){
		return new UserServiceImpl();
	}

}
