package com.lovecoding.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping()
	public String showIndexJSP(){
		return "index";
	}
	
	@RequestMapping("/springIntro")
	public String showSpringIntroJSP(){
		return "springIntro";
	}
}
