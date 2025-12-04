package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
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
  public Iterable<Vaccine> featchDetailBySorting(Boolean status, String... properties) {

	  Sort  sort = Sort.by(status?Direction.ASC:Direction.DESC, properties);
	  return repo.findAll(sort);
	
  }

  @Override
  public List<Vaccine> featchDetailByPagination(int pgno, int pgsize, Boolean status, String... properties) {
	
PageRequest pageable = PageRequest.of(pgno, pgsize,status?Direction.ASC:Direction.DESC, properties);
	 // repo.findAll(pageable);

	  Page<Vaccine> page = repo.findAll(pageable);
	  return page.getContent();
  }

  @Override
  public void fetchDeatilsByPagination(int pageSize) {

	  long count = 10l; 
	  long pagecount = count/pageSize;
	  //14/5 = 2.8
	  pagecount = count%pageSize == 0?pagecount:++pagecount;
	  
	  for(int i=0;i<pagecount;i++) {
		PageRequest pageable =  PageRequest.of(i, pageSize);
		Page<Vaccine>  page= repo.findAll(pageable);
		page.getContent().
		forEach(v->System.out.println(v.getVaccineName()));
		System.out.println("-----------------------------");
	  }
	  
	
  }
  
  
  

}

















