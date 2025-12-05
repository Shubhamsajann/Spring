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
  public List<Vaccine> fetchByVaccineCompany(String companyName) {
	// TODO Auto-generated method stub
	return repo.searchByVaccineCompany(companyName);
  }

  @Override
  public List<Vaccine> fetchByVaccineCompany(String comp1, String comp2) {
	// TODO Auto-generated method stub
	return repo.searchByVaccineCompany(comp1, comp2);
  }

  



 
  
  }