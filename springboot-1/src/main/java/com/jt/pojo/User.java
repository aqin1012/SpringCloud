package com.jt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data	//set/get/toString/eq等操作
@Accessors(chain=true)	//开启链式加载规则
@NoArgsConstructor		//无参构造
@AllArgsConstructor		//添加参数构造时,最好添加无参构造
public class User {
	
	private Integer id;
	private String name;
	private Integer age;
	private String sex;
	
	/**
	 * 执行set方法,之后返回对象本身.
	 */
	/*public User setId(Integer id) {
		
		this.id = id;
		return this;
	}
	
	public User setName(String name) {
		
		this.name = name;
		return this;
	}*/
	
	
	
	
}
