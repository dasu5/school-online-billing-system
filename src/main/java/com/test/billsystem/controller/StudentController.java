package com.test.billsystem.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.billsystem.model.Student;
import com.test.billsystem.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/getStudentList")
	public String viewHomePage(Model model) {
		model.addAttribute("listStudents", studentService.getStudentList());	
		return "index";
	}
	
	@GetMapping("/showNewStudentForm")
	public String showNewStudentForm(Model model) {
		//create model attribute to bind form data
		Student student = new Student();
		model.addAttribute("student", student);
		return "new_student";
	}
	
	@PostMapping("/addStudent")
	public String addStudent(@ModelAttribute("student") Student student) {
		studentService.addStudent(student);
		return "redirect:/getStudentList";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    dateFormat.setLenient(false);
	    webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
	
	@GetMapping("showUpdateStudentForm/{id}")
	public String showUpdateStudentForm(@PathVariable(value = "id") int id, Model model) {
		Student student = studentService.getStudentById(id);
		model.addAttribute("student", student);
		return "update_student";
	}
	
	@GetMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable(value = "id") int id, Model model) {
		this.studentService.deleteStudentById(id);
		return "redirect:/getStudentList";
	}
}
