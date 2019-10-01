package com.lovecoding.springmvc.beans;

import org.springframework.stereotype.Component;

@Component
public class StudentDetails {

	
	private String studentName;
	private String studentEmail;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	
	
}
