package com.mongo.service;

import java.util.List;

import com.mongo.dto.CustomerDto;
import com.mongo.model.Customer;

public interface ICustomerService {
	
	public String registerCustomer(CustomerDto dto);
	public List<Customer> findAllCustomer();
	public String removeDocument(String id);
	 
	

}
