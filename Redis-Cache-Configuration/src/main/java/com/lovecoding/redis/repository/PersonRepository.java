package com.lovecoding.redis.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lovecoding.redis.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{



}
