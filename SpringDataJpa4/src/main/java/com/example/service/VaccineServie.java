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
  public Vaccine searchVaccineById(int id) {
      Vaccine v = repo.findById(id).orElse(null);
      System.out.println(v);
      return v;
  }
//  @Override
//  public List<Vaccine> searchVaccineByGivenId(Vaccine vac, Boolean status, String... params) {
//	// TODO Auto-generated method stub	
//	  Sort sort =   Sort.by(status?Direction.ASC:Direction.DESC, params);
//	   
//	return repo.findAll(sort);
//	  
//  }  
  @Override
  public List<Vaccine> searchVaccineByGivenId(Vaccine vac) {
	  
	  Example<Vaccine> example = Example.of(vac);
	  return repo.findAll(example);
  }
  @Override
  public String removeVaccineInfoById(Iterable<Integer> ids) {
	List<Vaccine> list =repo.findAllById(ids);
	if(list.size()!=0) {
		repo.deleteAllByIdInBatch(ids);
		return "Records Deleted by given id";
		
	}
	
	
	return "Unable to delete";
  }
  }