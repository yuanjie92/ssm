package com.shsxt.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shsxt.model.data.StudentData;
import com.shsxt.service.StudentService;

@Controller
public class StudentController {

	@Resource
	private StudentService studentService;

	@RequestMapping("/loadStudents")
	public String loadStudents(Model model) {
		List<StudentData> stuDatas = studentService.findAll();
		model.addAttribute("stuDatas", stuDatas);
		return "students";
	}

}
