package com.shsxt.dao.impl;

import com.shsxt.common.dao.CommonDao;
import com.shsxt.dao.StudentDao;

public class StudentDaoImpl implements StudentDao {

	private CommonDao commonDao;

	public CommonDao getCommonDao() {
		return commonDao;
	}

	public void setCommonDao(CommonDao commonDao) {
		this.commonDao = commonDao;
	}

}
