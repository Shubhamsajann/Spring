package com.example.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
 

import com.example.entity.Vaccine;
import com.example.view.ResultView;

// Repository interface for Vaccine entity

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {
	//find-By
	List<ResultView> findByCostLessThan(Double cost);
	 
    
	
}
