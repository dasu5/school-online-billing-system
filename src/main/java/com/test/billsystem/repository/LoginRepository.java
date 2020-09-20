package com.test.billsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.billsystem.model.User;

@Repository
public interface LoginRepository extends JpaRepository<User, Integer>{

}
