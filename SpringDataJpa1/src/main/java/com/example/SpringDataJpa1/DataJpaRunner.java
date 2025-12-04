package com.example.SpringDataJpa1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.SpringDataJpa1.entity.Alien;
import com.example.SpringDataJpa1.repo.IAlienRepo;

@Component
public class DataJpaRunner implements CommandLineRunner {

	@Autowired
	private IAlienRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		  repo.save(new Alien(1,"rohan","bengaluru"));
	}

}
