package com.lovecoding.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lovecoding.springmvc.beans.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private Student student;
	
	@RequestMapping("/showForm")
	public String showForm(Model model){
		
		model.addAttribute("student", student);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent){
		
		System.out.println("Student Data :"+theStudent.getFirstName()+" "+theStudent.getLastName());
		
		return "student-confirmation";
	}
}
