package com.lovecoding.spring_core;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	//Field level injection
	/*@Autowired
	@Qualifier("happyFortuneService")*/
	private FortuneService fortuneService;

	//constructor injection
	@Autowired //Not necessary if there is only one constructor
	public TennisCoach(@Qualifier("fortuneFileService")FortuneService fortuneService) {
		System.out.println("Inside contructor.."+this.getClass().getSimpleName());
		this.fortuneService = fortuneService;
	}

	/*//setter Injection
	 * @Autowired
	public void setFortuneService(FortuneService fortuneService){
		this.fortuneService=fortuneService;
	}*/
	
	public String getDailyWorkSchedule() {
		
		return "Start practicing from 5-7PM everyday..!";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	@PostConstruct
	public void doMyStartupStuff(){
		System.out.println("Inside startup postconstruct..!");
	}
	
	@PreDestroy
	public void doMyCleanupStuff(){
		System.out.println("Inside cleanup method..!");
	}
}
