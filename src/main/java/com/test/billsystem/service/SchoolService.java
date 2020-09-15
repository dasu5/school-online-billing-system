package com.test.billsystem.service;

import java.util.List;

import com.test.billsystem.model.School;

public interface SchoolService {

	List<School> getSchoolList();
	void addSchool(School school);
	School getSchoolById(int id);
	void deleteSchoolById(int id);
}
