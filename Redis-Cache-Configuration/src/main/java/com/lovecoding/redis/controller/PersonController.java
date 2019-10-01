package com.lovecoding.redis.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lovecoding.redis.model.Person;
import com.lovecoding.redis.repository.PersonRepository;

@RestController
public class PersonController {

	 private final Logger LOG = LoggerFactory.getLogger(getClass());

	 
	private final PersonRepository personRepo;
	
	@Autowired
	public PersonController(PersonRepository personRepo){
		this.personRepo=personRepo;
	}
	
	@Cacheable(value = "persons", key = "#personId", unless = "#result.followers < 12000")
	@GetMapping(value="/{personId}")
	public Person getPerson(@PathVariable String personId){
		LOG.info("Getting person with ID :", personId);
		return (Person) personRepo.getOne(Long.valueOf(personId));
	}
}
