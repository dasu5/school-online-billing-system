package com.test.billsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.billsystem.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
