package com.example.service;

import java.util.Collection;
import java.util.List;
 

import com.example.entity.Vaccine;


// Service layer interface – defines the operations we support

public interface IVaccineService {
	
	public List<Vaccine> featchByCost(Double cost);
	public List<Vaccine> featchByCostLessThenEqual(Double cost);
	public List<Vaccine>  featchByCostBetween(Double startCost,Double endCost);
	
	public List<Vaccine> featchByVaccineCompanyEquals(String name);
	public List<Vaccine> fetchByVaccineCompanyInAndCostBetween(Collection<String>  name,Double minCost,Double maxCost);
	
	
}
