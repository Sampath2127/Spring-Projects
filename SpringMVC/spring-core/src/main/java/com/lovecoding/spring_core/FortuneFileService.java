package com.lovecoding.spring_core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FortuneFileService implements FortuneService {

	private String fileName="./src/fortune-test-data.txt";
	private List<String> fortunes;
	
	
	public FortuneFileService(){
	
	}
	
	@PostConstruct
	public void readFiles(){
		fortunes = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader(new File(fileName)))){
			String tempLine;
			while((tempLine=br.readLine())!=null){
				fortunes.add(tempLine);
			}
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		
	}


	@Override
	public String getFortune() {
		Random rand=new Random();
		return fortunes.get(rand.nextInt(fortunes.size()));
	}
}
