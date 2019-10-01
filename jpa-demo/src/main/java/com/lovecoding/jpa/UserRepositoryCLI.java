package com.lovecoding.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.lovecoding.jpa.daoservice.UserDaoService;
import com.lovecoding.jpa.entity.User;

@Component
public class UserRepositoryCLI implements CommandLineRunner {

	private static final Logger log=LoggerFactory.getLogger(UserRepositoryCLI.class);
	@Autowired
	private UserDaoService userDaoService;
	
	@Override
	public void run(String... args) throws Exception {
		
		User user=new User("Sam", "Admin");
		User user2=new User("Adam", "Developer");
		long userId=userDaoService.insert(user);
		userDaoService.insert(user2); 
		log.info("User is created with userId : "+userId);
	}

}
