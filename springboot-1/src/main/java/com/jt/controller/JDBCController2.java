package com.jt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 如果需要批量为属性赋值时,则添加jar包文件,之后利用注解
 * 动态实现批量赋值.
 * @author LYJ
 *
 */
@RestController
@ConfigurationProperties(prefix="jdbc2")
public class JDBCController2 {
	
	/**
	 * 	步骤:
	 * 		1.导入jar包文件
	 * 		2.编辑YML配置文件 完成key-value定义
	 * 		3.完成赋值 要求YML配置文件中的名称必须与属性一致,
	 * 	    4. 赋值时需要使用set方法完成赋值操作
	 * 
	 */
	private String url;
	private Integer port;
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	
	@RequestMapping("/getJDBC2")
	public String getMsg() {
		
		return "获取数据为:"+url+":"+port;
	}
}
