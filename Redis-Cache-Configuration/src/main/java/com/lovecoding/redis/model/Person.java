package com.lovecoding.redis.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Person implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3065326210248444701L;
	@Id
	@SequenceGenerator(name="SEQ_GEN", sequenceName="SEQ_USER", allocationSize=1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_GEN")
	private Long id;
	private String name;
	private long followers;
	
	protected Person(){
		
	}
	
	public Person(String name, long followers) {
		this.name = name;
		this.followers = followers;
	}

	public Long getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getFollowers() {
		return followers;
	}

	public void setFollowers(long followers) {
		this.followers = followers;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", followers=" + followers + "]";
	}
	
	
		
}
