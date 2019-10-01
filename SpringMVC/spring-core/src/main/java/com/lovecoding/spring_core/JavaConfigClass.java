package com.lovecoding.spring_core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.lovecoding.spring_core")
public class JavaConfigClass {

	@Bean
	public FortuneService luckyFortuneService(){
		return new LuckyFortuneService();
	}
	
	@Bean
	public Coach swimCoach(){
		return new SwimCoach(luckyFortuneService());
	}
	
}
