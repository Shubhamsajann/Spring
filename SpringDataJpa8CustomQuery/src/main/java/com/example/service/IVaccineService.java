package com.example.service;

import java.util.Collection;
import java.util.List;

import org.springframework.data.repository.query.Param;

import com.example.entity.Vaccine;


// Service layer interface – defines the operations we support

public interface IVaccineService {
	
public List<Vaccine> fetchByVaccineCompany(String companyName);
public List<Vaccine> fetchByVaccineCompany(String comp1,String comp2);
public List<String> fetchvaccineByCost( Double maxPrice1 , Double  maxPrice2);
	
public int updadteThePriceByVaccineName(Double newPrice,String vaccineName );
public int deleteTheVaccineByvaccineName(String vaccineName );
public int insertVaccineDetails(String vaccineName,String vaccineCompany,Double cost );



}
