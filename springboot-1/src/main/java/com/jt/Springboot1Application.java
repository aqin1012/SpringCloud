package com.jt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//3.当前注解开始工作.
@SpringBootApplication
public class Springboot1Application {
	
	//1.main方法的作用 java(jar)程序的唯一入库.
	public static void main(String[] args) {
		//2.按照springBoot的规则 执行run方法. 参数传递的是当前的类的class类型
		SpringApplication.run(Springboot1Application.class, args);
	}

}
