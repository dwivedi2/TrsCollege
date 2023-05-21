package com.TrsCollege.restController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TrsCollege.Dto.StudentDto;
import com.TrsCollege.entity.Student;
import com.TrsCollege.repository.StudentRepository;

@RestController
@RequestMapping("/api/student")
public class StudentRestController {
	
	@Autowired
	private StudentRepository studentRepo;
	
	//http://localhost:8080/api/student
	@GetMapping    //tack data in data base and get data json 
	public List<Student>getAllStudent(){
		List<Student> student = studentRepo.findAll();
		return student;
	}
	
	@PostMapping
	public void savedata(@RequestBody Student student) {//json content copy in lead class with the help of @RequestBody
		studentRepo.save(student);
	}
	
	//http://localhost:8080/api/student/1
	@DeleteMapping("/{id}")
	public void deleteStudent(@PathVariable("id") int id) {//@pathVariable read the value for url
		studentRepo.deleteById(id);
	
	}
	
	//http://localhost:8080/api/student/1
	@PutMapping
	public void updatedata(@RequestBody Student dto) {
//		Student s = new Student();
//		s.setId(id);
//		s.setName(dto.getName());
//		s.setStander(dto.getStander());
//		s.setEmail(dto.getEmail());
//		s.setMobile(dto.getMobile());
//		studentRepo.save(s);
		studentRepo.save(dto);
	}
	
	@GetMapping("/{id}")
	public Student getById(@PathVariable("id") int id) {
		Optional<Student> lists = studentRepo.findById(id);
		return lists.get();
	}
}
