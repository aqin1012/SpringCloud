package com.jt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController		//@Controller + @ResponseBody
public class JDBCController {
	
	/**
	 * 如果将配置直接写死到java文件中,那么后期扩展时不便.
	 * 
	 * 思路:能否利用注解,为属性动态赋值
	 *	
	 *	方式1:	利用@Value注解为属性赋值
	 *	步骤:
	 *		1.需要将整个Controller类交给Spring容器管理
	 *		2.当spring容器启动时,首先加载YML配置文件.之后根据key-value格式将数据
	 *		保存到Spring所维护的Map集合中.
	 *		3.利用@Value注解+spel表达式动态取值.
	 */
	@Value("${jdbc.url}")
	private String url;	// = "localhost:3306/mysql";
	@Value("${jdbc.port}")
	private Integer port;	// = 3306;
	
	@RequestMapping("/getJDBC1")
	public String getMsg() {
		
		return "获取数据为:"+url+":"+port;
	}
}
