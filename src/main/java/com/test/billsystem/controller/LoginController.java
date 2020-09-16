package com.test.billsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.billsystem.model.User;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String getLoginForm() {
		return "login";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute(name="User") User user, Model model) {
		String username = user.getName();
		String password = user.getPassword();
		
		if ("admin".equals(username) && "admin".equals(password)) {
			return "index";
		}
		model.addAttribute("invalidCredentials", true);
		return "/login";
	}
}
