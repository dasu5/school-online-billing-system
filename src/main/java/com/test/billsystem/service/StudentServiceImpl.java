package com.test.billsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.billsystem.model.Student;
import com.test.billsystem.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public List<Student> getStudentList() {
		return studentRepo.findAll();
	}

	@Override
	public void addStudent(Student student) {
		this.studentRepo.save(student);
		
	}

	@Override
	public Student getStudentById(int id) {
		Optional<Student> optional = studentRepo.findById(id);
		Student student = null;
		
		if (optional.isPresent()) {
			student = optional.get();
		} else {
			throw new RuntimeException("Student not found for id :" + id);
		}
		return student;
	}

	@Override
	public void deleteStudentById(int id) {
		this.studentRepo.deleteById(id);
	}

	
}
