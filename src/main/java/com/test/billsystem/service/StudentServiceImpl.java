package com.test.billsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.billsystem.model.Student;
import com.test.billsystem.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public List<Student> getCustomerList() {
		return studentRepo.findAll();
	}

	
}
