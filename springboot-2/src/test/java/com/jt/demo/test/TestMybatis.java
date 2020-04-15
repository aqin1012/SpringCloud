package com.jt.demo.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jt.demo.mapper.UserMapper;
import com.jt.demo.pojo.User;

@SpringBootTest
public class TestMybatis {
	
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testFindUser() {
		
		List<User> userList = userMapper.findAll();
		System.out.println(userList);
	}
}
