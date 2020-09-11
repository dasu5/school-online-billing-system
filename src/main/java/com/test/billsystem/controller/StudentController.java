package com.test.billsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.billsystem.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/getCustomerList")
	public String viewHomePage(Model model) {
		model.addAttribute("listCustomers", studentService.getCustomerList());	
		return "index";
	}
}
