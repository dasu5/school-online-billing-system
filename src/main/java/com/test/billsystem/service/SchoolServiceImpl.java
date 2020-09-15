package com.test.billsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.billsystem.model.School;
import com.test.billsystem.repository.SchoolRepository;

@Service
public class SchoolServiceImpl implements SchoolService{

	@Autowired
	private SchoolRepository schoolRepository;

	@Override
	public List<School> getSchoolList() {
		return schoolRepository.findAll();
	}

	@Override
	public void addSchool(School school) {
		this.schoolRepository.save(school);
		
	}

	@Override
	public School getSchoolById(int id) {
		Optional<School> optional = schoolRepository.findById(id);
		School school = null;
		
		if (optional.isPresent()) {
			school = optional.get();
		} else {
			throw new RuntimeException("School not found for id :" + id);
		}
		return school;
	}

	@Override
	public void deleteSchoolById(int id) {
		this.schoolRepository.deleteById(id);
		
	}
}
