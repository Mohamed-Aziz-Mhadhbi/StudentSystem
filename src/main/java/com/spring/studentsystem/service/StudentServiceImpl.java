package com.spring.studentsystem.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.studentsystem.model.Student;
import com.spring.studentsystem.repository.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentrepository;

	@Override
	public Student saveStudent(Student student) {
		return studentrepository.save(student);
	}

}
