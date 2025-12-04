package com.example.repo;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.entity.Vaccine;

// Repository interface for Vaccine entity

public interface IVaccineRepo extends PagingAndSortingRepository<Vaccine, Integer> {
	
    // No code needed here – Spring Data JPA generates implementation automatically
	
}
