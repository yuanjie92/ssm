package com.shsxt.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shsxt.model.StudentModel;
import com.shsxt.model.data.StudentData;
import com.shsxt.model.form.StudentForm;
import com.shsxt.service.StudentService;

@Controller
public class StudentController {

	@Resource
	private StudentService studentService;

	@RequestMapping("/loadStudents")
	public String loadStudents(Model model) {
		List<StudentModel> list = studentService.findAll();
		model.addAttribute("stuDatas", list);
		return "/students";
	}

	@RequestMapping("/addStudent")
	public String addStudent() {
		return "add";
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String addStudent(StudentForm studentForm) {
		studentService.add(studentForm);
		return "redirect:loadStudents";
	}

	@RequestMapping("/loadStudentById")
	public String loadStudentById(Integer id, Model model) {
		StudentData stuData = studentService.findById(id);
		model.addAttribute("stuData", stuData);
		return "edit";
	}

	@RequestMapping(value = "/udpateStudentById", method = RequestMethod.POST)
	public String udpateStudentById(StudentForm studentForm) {
		studentService.updateStudent(studentForm);
		return "redirect:loadStudents";
	}

	@RequestMapping("/deleteStudentById")
	public String deleteStudentById(StudentForm studentForm) {
		studentService.delete(studentForm);
		return "redirect:loadStudents";
	}
}
