package com.lovecoding.spring_core;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	 

	public String getFortune() {
		
		return "Your Luck is on it's waY..!";
	}

}
