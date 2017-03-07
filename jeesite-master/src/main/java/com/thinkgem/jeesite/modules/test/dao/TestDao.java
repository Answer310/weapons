/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.test.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.test.entity.Test;

/**
 * 测试DAO接口
 * @author wangchenyu
 * @version 2017-03-07
 */
@MyBatisDao
public interface TestDao extends CrudDao<Test> {
	
}