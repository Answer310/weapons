/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.test.entity;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 测试Entity
 * @author wangchenyu
 * @version 2017-03-07
 */
public class Test extends DataEntity<Test> {
	
	private static final long serialVersionUID = 1L;
	private String name;		// name
	private String age;		// age
	private String sex;		// sex
	private String test;		// test
	
	public Test() {
		super();
	}

	public Test(String id){
		super(id);
	}

	@Length(min=0, max=255, message="name长度必须介于 0 和 255 之间")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Length(min=0, max=11, message="age长度必须介于 0 和 11 之间")
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	@Length(min=0, max=255, message="sex长度必须介于 0 和 255 之间")
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Length(min=0, max=255, message="test长度必须介于 0 和 255 之间")
	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}
	
}