package com.shsxt.common.service;

import java.util.List;

import com.shsxt.common.dao.CommonDao;

public class CommonService {

	private CommonDao commonDao;

	// 查询全部
	public <T> List<T> loadAllEntity(Class<T> clazz) {
		return commonDao.loadAllEntity(clazz);
	}

	// 单个属性查询对象list
	public <T> List<T> getEntitiesByField(Class<T> clazz, String field, Object value) {
		return commonDao.getEntitiesByField(clazz, field, value);
	}

	// 根据ID查询 单个 对象
	public <T> Object load(Class clazz, int id) {
		return commonDao.load(clazz, id);
	}

	// 根据ID查询 单个 对象
	public <T> Object get(Class clazz, int id) {
		return commonDao.load(clazz, id);
	}

	public <T> void saveOrUpdateEntity(T entry) {
		commonDao.saveOrUpdateEntity(entry);
	}

	public <T> void update(T entry) {
		commonDao.update(entry);
	}

	public <T> void delete(T entry) {
		commonDao.delete(entry);
	}

	public CommonDao getCommonDao() {
		return commonDao;
	}

	public void setCommonDao(CommonDao commonDao) {
		this.commonDao = commonDao;
	}

}
