package com.example.repo;
import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
 

import com.example.entity.Vaccine;

// Repository interface for Vaccine entity

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {

	//findBy-PropertyName-Keyword
	//method name of pojo
	
	public List<Vaccine> findByCost(Double cost);
//	public List<Vaccine> findByCostIs(Double cost);
//	public List<Vaccine> findByCostEqual(Double cost);
	
	public List<Vaccine> findByCostLessThanEqual(Double cost);
	
	public List<Vaccine> findByCostBetween(Double startCost,Double endCost);
	public List<Vaccine> findByVaccineCompanyEquals(String name);
	public List<Vaccine> findByVaccineCompanyInAndCostBetween(Collection<String>  name,Double minCost,Double maxCost);
	
	 
    
	
}
