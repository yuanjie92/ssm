package com.shsxt.service.impl;

import java.util.Date;
import java.util.List;

import com.shsxt.common.service.CommonService;
import com.shsxt.dao.StudentDao;
import com.shsxt.model.StudentModel;
import com.shsxt.model.data.StudentData;
import com.shsxt.model.form.StudentForm;
import com.shsxt.service.StudentService;
import com.shsxt.utils.DateUtil;

public class StudentServiceImpl implements StudentService {

	private CommonService commonService;
	private StudentDao StudentDao;

	@Override
	public List<StudentModel> findAll() {
		return commonService.loadAllEntity(StudentModel.class);
	}

	@Override
	public void add(StudentForm studentForm) {
		StudentModel studentModel = new StudentModel();
		studentModel.setAvailable(true);
		studentModel.setBirthday(DateUtil.getDateByString(studentForm.getBirthday()));
		studentModel.setClazz(studentForm.getClazz());
		studentModel.setName(studentForm.getName());
		studentModel.setCreateTime(new Date());
		studentModel.setModifyTime(new Date());
		commonService.saveOrUpdateEntity(studentModel);
	}

	@Override
	public StudentData findById(Integer id) {
		StudentModel studentModel = (StudentModel) commonService.load(StudentModel.class, id);
		StudentData studentData = new StudentData();
		studentData.setId(studentModel.getId());
		studentData.setName(studentModel.getName());
		studentData.setBirthday(studentModel.getBirthday());
		studentData.setClazz(studentModel.getClazz());
		return studentData;
	}

	@Override
	public void updateStudent(StudentForm studentForm) {
		StudentModel studentModel = new StudentModel();
		studentModel.setId(studentForm.getId());
		studentModel.setAvailable(true);
		studentModel.setBirthday(DateUtil.getDateByString(studentForm.getBirthday()));
		studentModel.setClazz(studentForm.getClazz());
		studentModel.setName(studentForm.getName());
		studentModel.setModifyTime(new Date());
		commonService.saveOrUpdateEntity(studentModel);
	}

	@Override
	public void delete(StudentForm studentForm) {
		StudentModel studentModel = (StudentModel) commonService.load(StudentModel.class, studentForm.getId());
		commonService.delete(studentModel);
	}

	public CommonService getCommonService() {
		return commonService;
	}

	public void setCommonService(CommonService commonService) {
		this.commonService = commonService;
	}

	public StudentDao getStudentDao() {
		return StudentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		StudentDao = studentDao;
	}

}
