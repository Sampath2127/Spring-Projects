package com.lovecoding.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import com.lovecoding.redis.model.Person;
import com.lovecoding.redis.repository.PersonRepository;

@SpringBootApplication
@EnableCaching
public class RedisCacheConfigurationApplication implements CommandLineRunner{
	
	private final Logger logger=LoggerFactory.getLogger(RedisCacheConfigurationApplication.class);
	
	private final PersonRepository personRepo;

	public static void main(String[] args) {
		SpringApplication.run(RedisCacheConfigurationApplication.class, args);
	}
	
	@Autowired 
	public RedisCacheConfigurationApplication(PersonRepository personRepo){
		this.personRepo=personRepo; 
	}

	 
	@Override
	public void run(String... args) throws Exception {
		
		logger.info("Users added to h2 memory.. ", personRepo.count());
		
		Person sam=new Person("Sam", 10000);
		Person Ram=new Person("Ram", 20000);
		Person Tam=new Person("Tam", 7000);
		Person Jam=new Person("Jam", 1000);
		Person Pam=new Person("Pam", 19000);
		
		personRepo.save(sam);
		personRepo.save(Ram);
		personRepo.save(Tam);
		personRepo.save(Jam);
		personRepo.save(Pam);
		logger.info("User's saved to h2..: ", personRepo.findAll());
	}

}
