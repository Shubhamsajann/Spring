package com.example.service;

import java.util.Collection;
import java.util.List;
 

import com.example.entity.Vaccine;


// Service layer interface – defines the operations we support

public interface IVaccineService {
	
public List<Vaccine> fetchByVaccineCompany(String companyName);
public List<Vaccine> fetchByVaccineCompany(String comp1,String comp2);

	
}
