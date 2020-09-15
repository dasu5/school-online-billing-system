package com.test.billsystem.service;

import java.util.List;

import com.test.billsystem.model.Student;

public interface StudentService {

	List<Student> getStudentList();
	void addStudent(Student student);
	Student getStudentById(int id);
	void deleteStudentById(int id);
	
}
