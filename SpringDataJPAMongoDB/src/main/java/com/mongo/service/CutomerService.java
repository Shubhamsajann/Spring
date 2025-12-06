 package com.mongo.service;

import java.beans.beancontext.BeanContext;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.dto.CustomerDto;
import com.mongo.model.Customer;
import com.mongo.repo.ICustomerRepo;

@Service
public class CutomerService implements ICustomerService {
	
	@Autowired
	private	ICustomerRepo repo;
	
//	 public void SetICustomerrepo(ICustomerRepo repo) {
//		 this.repo = repo;
//	 }

	@Override
	public String registerCustomer(CustomerDto dto) {
		// TODO Auto-generated method stub
		Customer cx  =  new Customer();
		BeanUtils.copyProperties(dto, cx);
	Customer	cxDoc = repo.save(cx);
		return "Customer info Stored with id"+ cxDoc.getId();
	}

	@Override
	public List<Customer> findAllCustomer() {
		// TODO Auto-generated method stub
		return repo.findAll(); 
	}

	@Override
	public String removeDocument(String id) {
		 Optional<Customer> optional =repo.findById(id);
		if( optional.isPresent()) {
			repo.deleteById(id);
			return "Customer Document with id "+ id+ "is deleted"; 
		}
		
		return "No Document found with id" + id +" to delete";
	}

}
