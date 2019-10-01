package com.lovecoding.spring_core;

import org.springframework.stereotype.Component;

@Component
public class RandomFortune implements FortuneService{

	public String getFortune() {
		return "Things will get settled dont worrY..!";
	}

}
