package com.example.repo;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

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

	@Query("SELECT vaccineName, vaccineCompany FROM Vaccine WHERE cost BETWEEN :c1 AND :c2")
	public List<String> searchvaccineByCost(@Param("c1") Double maxPrice1 ,
	                                            @Param("c2") Double  maxPrice2);

	@Transactional
	@Modifying
    @Query("UPDATE Vaccine set cost=:newPrice WHERE vaccineName=:vaccineName")
	public int updatePriceByVaccineName(Double newPrice,String vaccineName );
	
	
	@Transactional
	@Modifying
    @Query("delete From Vaccine WHERE vaccineName=:vaccineName")
	public int deleteVaccineByvaccineName(String vaccineName );
	
	@Transactional
	@Modifying
    @Query(value="insert into vaccine(vaccine_company,vaccine_name,cost) Values(?,?,?)" ,nativeQuery = true)
	public int insertVaccineInfo(String vaccineName,String vaccineCompany,Double cost );
	
	 @Query(value="select now()from dual" ,nativeQuery = true)
	public LocalDateTime getTheSystemDateAndTime();
	
}
