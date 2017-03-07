/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.test.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.test.entity.Test;
import com.thinkgem.jeesite.modules.test.dao.TestDao;

/**
 * 测试Service
 * @author wangchenyu
 * @version 2017-03-07
 */
@Service
@Transactional(readOnly = true)
public class TestService extends CrudService<TestDao, Test> {

	public Test get(String id) {
		return super.get(id);
	}
	
	public List<Test> findList(Test test) {
		return super.findList(test);
	}
	
	public Page<Test> findPage(Page<Test> page, Test test) {
		return super.findPage(page, test);
	}
	
	@Transactional(readOnly = false)
	public void save(Test test) {
		super.save(test);
	}
	
	@Transactional(readOnly = false)
	public void delete(Test test) {
		super.delete(test);
	}
	
}