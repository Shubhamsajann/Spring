package com.example.SpringDataJpa1.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringDataJpa1.entity.Alien;

@Repository
public interface IAlienRepo extends CrudRepository<Alien, Integer> {
	
	

}
