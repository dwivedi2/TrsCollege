package com.TrsCollege.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TrsCollege.entity.Student;
import com.TrsCollege.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public void studentDataSave(Student student) {
		studentRepo.save(student);

	}

	@Override
	public List<Student> getAllStudent() {
		List<Student> student = studentRepo.findAll();
		return student;
	}

	@Override
	public void DeleteById(Integer id) {
		studentRepo.deleteById(id);
	}

	@Override
	public Student findStudentById(Integer id) {
		Optional<Student> findById = studentRepo.findById(id);
		return findById.get();
	}

}
