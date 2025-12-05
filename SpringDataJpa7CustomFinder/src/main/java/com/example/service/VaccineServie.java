package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entity.Vaccine;
import com.example.repo.IVaccineRepo;

import java.util.Collection;
import java.util.List;
@Service
// This class contains business logic and interacts with Repository layer.
public class VaccineServie implements IVaccineService {
	 
  private IVaccineRepo repo;
  
  @Autowired
  public void setRepo(IVaccineRepo repo) {
	 
	  this.repo = repo;
  }

  @Override
  public List<Vaccine> featchByCost(Double cost) {

	return 	repo.findByCost(cost);
  }

  @Override
  public List<Vaccine> featchByCostLessThenEqual(Double cost) {
	// TODO Auto-generated method stub
	return repo.findByCostLessThanEqual(cost);
  }

  @Override
  public List<Vaccine> featchByCostBetween(Double startCost,Double endCost) {
	// TODO Auto-generated method stub
	return repo.findByCostBetween(startCost,endCost);
  }

  @Override
  public List<Vaccine> featchByVaccineCompanyEquals(String name) {
	// TODO Auto-generated method stub
	return repo.findByVaccineCompanyEquals(name);
  }

  @Override
  public List<Vaccine> fetchByVaccineCompanyInAndCostBetween(Collection<String> name, Double minCost, Double maxCost) {
	// TODO Auto-generated method stub
	return repo.findByVaccineCompanyInAndCostBetween(name, minCost, maxCost);
  }



 
  
  }