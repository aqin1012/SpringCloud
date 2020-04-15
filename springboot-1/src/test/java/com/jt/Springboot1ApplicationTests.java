package com.jt;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jt.controller.JDBCController;
import com.jt.pojo.User;

@SpringBootTest	//启动springBoot的程序
class Springboot1ApplicationTests {
	
	//利用容器,动态的为测试类中的属性赋值.
	@Autowired
	private JDBCController JDBCController;
	
	@Test
	void contextLoads() {
		
		System.out.println(JDBCController.getMsg());
	}
}
