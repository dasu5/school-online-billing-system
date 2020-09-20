package com.test.billsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.billsystem.model.User;
import com.test.billsystem.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginRepository loginRepository;
	
	@Override
	public void addUser(User user) {
		this.loginRepository.save(user);
	}

}
