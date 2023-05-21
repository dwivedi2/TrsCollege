package com.TrsCollege.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TrsCollege.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {


}
