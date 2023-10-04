package com.image.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.image.entity.Student;
import com.image.repository.StudentRepository;
import com.image.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student savaStudentData(Student student) {
		return studentRepository.save(student);
	}

}
