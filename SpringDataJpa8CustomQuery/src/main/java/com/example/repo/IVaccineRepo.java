package com.example.repo;
import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.entity.Vaccine;

// Repository interface for Vaccine entity

public interface IVaccineRepo extends JpaRepository<Vaccine, Integer> {
//custom
//	@Query("From Vaccine Where vaccineCompany=:company")
//	public List<Vaccine> searchByVaccineCompany(String company);
	
	
	@Query("From Vaccine Where vaccineCompany=:company")
	public List<Vaccine> searchByVaccineCompany(@Param("company")String company);
	
	
	@Query("From Vaccine Where vaccineCompany IN (:c1, :c2)")
	public List<Vaccine> searchByVaccineCompany(@Param("c1") String comp1,
	                                            @Param("c2") String comp2);

    
	
}
