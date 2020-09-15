package com.test.billsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.billsystem.model.School;
import com.test.billsystem.model.Student;
import com.test.billsystem.service.SchoolService;

@Controller
public class SchoolController {

	@Autowired
	private SchoolService schoolService;
	
	@GetMapping("/getSchoolList")
	public String viewSchoolPage(Model model) {
		model.addAttribute("listSchools", schoolService.getSchoolList());	
		return "school";
	}
	
	@GetMapping("/showNewSchoolForm")
	public String showNewSchoolForm(Model model) {
		//create model attribute to bind form data
		School school = new School();
		model.addAttribute("school", school);
		return "new_school";
	}
	
	@PostMapping("/addSchool")
	public String addSchool(@ModelAttribute("school") School school) {
		schoolService.addSchool(school);
		return "redirect:/getSchoolList";
	}
	
	@GetMapping("showUpdateSchoolForm/{id}")
	public String showUpdateSchoolForm(@PathVariable(value = "id") int id, Model model) {
		School school = schoolService.getSchoolById(id);
		model.addAttribute("school", school);
		return "update_school";
	}
	
	@GetMapping("/deleteSchool/{id}")
	public String deleteSchool(@PathVariable(value = "id") int id, Model model) {
		this.schoolService.deleteSchoolById(id);
		return "redirect:/getSchoolList";
	}
}
