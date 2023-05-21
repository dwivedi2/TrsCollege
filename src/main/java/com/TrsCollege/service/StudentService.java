package com.TrsCollege.service;

import java.util.List;

import com.TrsCollege.entity.Student;

public interface StudentService {
	
	public void studentDataSave(Student student);
	public List<Student> getAllStudent();
	public void DeleteById(Integer Id);
	public Student findStudentById(Integer id);
}
