package com.shsxt.service;

import java.util.List;

import com.shsxt.model.StudentModel;
import com.shsxt.model.data.StudentData;
import com.shsxt.model.form.StudentForm;

public interface StudentService {

	List<StudentModel> findAll();

	void add(StudentForm studentForm);

	StudentData findById(Integer id);

	void updateStudent(StudentForm studentForm);

	void delete(StudentForm studentForm);

}
