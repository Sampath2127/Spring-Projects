package com.lovecoding.spring_core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {

//    	ClassPathXmlApplicationContext applicationContext=
//    			new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(SportConfig.class);
    	
    	SwimCoach theCoach=applicationContext.getBean("swimCoach", SwimCoach.class);
    	
    	System.out.println(theCoach.getDailyWorkSchedule());
    	
    	System.out.println(theCoach.getDailyFortune());
    	
    	System.out.println("Email : " + theCoach.getEmail());
    	
    	System.out.println("Team : " + theCoach.getTeam());
    	
    	applicationContext.close();
    }
}
