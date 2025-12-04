package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.Vaccine;

// Service layer interface – defines the operations we support

public interface IVaccineService {

    // Save a single vaccine
    String registerVaccineInfo(Vaccine vaccine);

    // Save multiple vaccines at once
    Iterable<Vaccine> registrerMultipleVaccineInfo(Iterable<Vaccine> vaccines);

    // Count how many vaccines are present in table
    Long vaccineCount();

    // Check if a vaccine exists with given ID
    Boolean checkVaccineAvailibilty(Integer id);

    // Get all vaccines from table
    Iterable<Vaccine> getAllVaccineInfo();

    // Get vaccines whose IDs are in the given list
    Iterable<Vaccine> getAllVaccines(Iterable<Integer> ids);

	Optional<Vaccine> getVaccinesById(Integer id);
	
	
	public String removeVaccineById(Integer id);
	
	public String removeVaccineByVaccine(Vaccine obj);
	
	public String removeAllVaccineById(List<Integer> ids);
	
	
}
