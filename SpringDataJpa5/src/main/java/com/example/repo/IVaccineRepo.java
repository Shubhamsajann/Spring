package com.example.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
 

import com.example.entity.Vaccine;
import com.example.view.ResultView;
import com.example.view.View;

// Repository interface for Vaccine entity

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {
	

	public <T extends View>List<T> findByCostLessThan(Double cost,Class<T> cls);
	
}
