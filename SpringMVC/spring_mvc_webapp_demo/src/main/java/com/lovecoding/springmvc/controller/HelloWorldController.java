package com.lovecoding.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lovecoding.springmvc.beans.StudentDetails;

@Controller
@RequestMapping("/form")
public class HelloWorldController {

	@Autowired
	private StudentDetails studentDetails;
	
	@RequestMapping("/showForm")
	public String showForm(){
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@RequestParam("studentName")String studentName, @RequestParam("studentEmail")String studentEmail, Model model){
		studentDetails.setStudentName(studentName);
		studentDetails.setStudentEmail(studentEmail);
		model.addAttribute("studentDetails", studentDetails);
		return "studentForm-data";
	}
	
	@RequestMapping("/processLoginForm")
	public String processLoginForm(){
		
		return "student-confirmation";
	}
	
}
