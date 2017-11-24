package com.shsxt.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.shsxt.common.service.CommonService;
import com.shsxt.dao.StudentDao;
import com.shsxt.model.StudentModel;
import com.shsxt.model.data.StudentData;
import com.shsxt.service.StudentService;

public class StudentServiceImpl implements StudentService {

	private StudentDao studentDao;
	private CommonService commonService;

	@Override
	public List<StudentData> findAll() {
		List<StudentModel> stuModel = commonService.loadAllEntities(StudentModel.class);
		List<StudentData> list = new ArrayList<StudentData>();
		for (StudentModel stu : stuModel) {
			StudentData stuData = new StudentData();
			stuData.setAvailable(stu.isAvailable());
			stuData.setBirthday(stu.getBirthday());
			stuData.setClazz(stu.getClazz());
			stuData.setCreateTime(stu.getCreateTime());
			stuData.setId(stu.getId());
			stuData.setModifyTime(stu.getModifyTime());
			stuData.setName(stu.getName());
			list.add(stuData);
		}
		return list;
	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public CommonService getCommonService() {
		return commonService;
	}

	public void setCommonService(CommonService commonService) {
		this.commonService = commonService;
	}

}
