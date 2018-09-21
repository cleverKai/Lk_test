package cn.mvcproject.test;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import cn.mvcproject.utils.JdbcUtils;

public class JdbcUtilsTest {

	@Test
	public void testGetConnection() {
		Connection connection =JdbcUtils.getConnection();
		System.out.println(connection);
	}

}
