package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.entity.Vaccine;
import com.example.repo.IVaccineRepo;
import com.example.view.ResultView1;
import com.example.view.View;

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
  public <T extends View> List<T> fetchByCostLessThan(Double cost, Class<T> cls) {
	// TODO Auto-generated method stub
	return repo.findByCostLessThan(cost, cls);
  }
  
 



 

 
  
  
  }