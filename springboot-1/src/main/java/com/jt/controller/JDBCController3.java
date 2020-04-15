package com.jt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//让spring容器去加载指定的配置文件
//spring容器在内部会生成一个管理pro的集合信息
//注意事项:切记key重复的问题
//@PropertySource(value="classpath:/properties/jdbc.properties")
@PropertySources({@PropertySource(value="classpath:/properties/jdbc.properties")})
public class JDBCController3 {
	
	/**
	   赋值的前提: pro文件必须交给spring容器加载和管理.
	 * 赋值方式: 1.@Value注解   2.批量赋值方式
	 * 注意事项:如果yml配置文件和pro配置文件出现了重名的现象则以YML文件为准
	 */
	@Value("${jdbc3.url}")
	private String url;
	@Value("${jdbc3.port}")
	private Integer port;
	
	@RequestMapping("/getJDBC3")
	public String getMsg() {
		
		return "获取数据为:"+url+":"+port;
	}
}
