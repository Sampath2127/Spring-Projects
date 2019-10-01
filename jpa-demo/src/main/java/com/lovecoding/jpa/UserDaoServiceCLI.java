package com.lovecoding.jpa;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.lovecoding.jpa.daoservice.UserDaoService;
import com.lovecoding.jpa.daoservice.UserRepository;
import com.lovecoding.jpa.entity.User;

@Component
public class UserDaoServiceCLI implements CommandLineRunner {

	private static final Logger log=LoggerFactory.getLogger(UserDaoServiceCLI.class);
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		User user=new User("JilJil", "Admin");
		User user2=new User("Adam", "Developer");
		userRepository.save(user);
		userRepository.save(user2);
		
		Optional<User> userWithAnID = userRepository.findById(1L);
		log.info("User with ID "+1L+" is :"+userWithAnID);
		
		List<User> users = userRepository.findAll();
		log.info("All users:"+users);
		
		//log.info("User is created with userId : "+user);
	}

}
