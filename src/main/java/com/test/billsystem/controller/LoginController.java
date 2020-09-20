package com.test.billsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.billsystem.model.User;
import com.test.billsystem.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
//	@GetMapping("/login")
//	public String getLoginForm() {
//		return "home";
//	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute(name="User") User user, Model model) {
		String username = user.getUsername();
		String password = user.getPassword();
		
		if ("admin".equals(username) && "admin".equals(password)) {
			return "home";
		}
		model.addAttribute("invalidCredentials", true);
		return "/index";
	}
	
	@GetMapping("/getSignUpForm")
	public String getSignUpForm(Model model) {
		User user =  new User();
		model.addAttribute("user", user);
		return "sign_up";
	}
	
	@PostMapping("/signUp")
	public String signUp(@ModelAttribute("user") User user) {
		loginService.addUser(user);
		return "redirect:/login";
	}
}
