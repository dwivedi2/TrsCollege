package com.TrsCollege.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.TrsCollege.Dto.StudentDto;
import com.TrsCollege.entity.Student;
import com.TrsCollege.service.StudentService;
import com.TrsCollege.utility.EmailService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private EmailService emailService;
	
	//http://localhost:8080/add
	@RequestMapping("/add")
	public String studentController() {
		return("Student");
	}
	
	@RequestMapping("/savestudent")
	public String studentDataSave(@ModelAttribute Student student, Model model) {
		studentService.studentDataSave(student);
		emailService.sendEmail(student.getEmail(), "Test", "welcome to world");
		model.addAttribute("msg", "save student data thanks for your soport");
		return"Student";
	}
	
	
	
	//http://localhost:8080/alldata
	@RequestMapping("/alldata")
	public String AllStudentData(Model model) {
		List<Student> student = studentService.getAllStudent();
		model.addAttribute("student", student);
		return"search_student";
	}
	
	@RequestMapping("/delete")
	public String DeleteById(@RequestParam("id")Integer Id,Model model) {
		studentService.DeleteById(Id);
		List<Student> student = studentService.getAllStudent();
		model.addAttribute("student", student);
		return"search_student";
	}
	
	@RequestMapping("/update")
	public String getStudentById(@RequestParam("id")Integer Id,Model model) {
		Student student = studentService.findStudentById(Id);
		model.addAttribute("student", student);
		return "update";
	}
	
	@RequestMapping("/updatestudent")
	public String updatestudent(StudentDto dto,Model model) {
		Student s = new Student();
		s.setId(dto.getId());
		s.setName(dto.getName());
		s.setStander(dto.getStander());
		s.setEmail(dto.getEmail());
		s.setMobile(dto.getMobile());
		
		studentService.studentDataSave(s);
		
		List<Student> student = studentService.getAllStudent();
		model.addAttribute("student", student);
		return"search_student";
		
	}


}
