package com.lovecoding.springmvc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lovecoding.springmvc.beans.CustomerDetails;

@Controller
@RequestMapping("/customer")
public class CostomerController {
	
	@Autowired
	private CustomerDetails customerDetails;
	
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {

		StringTrimmerEditor editor = new StringTrimmerEditor(true);

		webDataBinder.registerCustomEditor(String.class, editor);
	}
	
	@RequestMapping("/showForm")
	public String displayForm(Model model){
		model.addAttribute("customerDetails", customerDetails);
		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processDetails(@Valid @ModelAttribute("customerDetails")CustomerDetails customerDetails, BindingResult bindingResult){
		if(bindingResult.hasErrors()){
			return "customer-form";
		}
		return "customer-confirmation-form";
	}
}
