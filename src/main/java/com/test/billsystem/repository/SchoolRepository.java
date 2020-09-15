package com.test.billsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.billsystem.model.School;

@Repository
public interface SchoolRepository extends JpaRepository<School, Integer>{

}
