package com.lovecoding.spring_core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig {

	@Bean
	public FortuneService luckyFortuneService(){
		return new LuckyFortuneService();
	}
	
	@Bean
	public Coach swimCoach(){
		return new SwimCoach(luckyFortuneService());
	}
}
