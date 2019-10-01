package com.lovecoding.jpa.daoservice;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lovecoding.jpa.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
