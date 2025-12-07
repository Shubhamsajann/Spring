package com.MultiDB.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MultiDB.model.customer.Customer;
import com.MultiDB.model.product.Product;
import com.MultiDB.repp.product.ICustomerRepo;
import com.MultiDB.repp.product.IProductRepo;

@RestController
public class MultiDbColntroller {
	
	@Autowired
	private ICustomerRepo repo1;
	
	@Autowired
	private IProductRepo repo2;
	
	@GetMapping("/getallcx")
	public List<Customer> getAllcx(){
		return  repo1.findAll();	
	}
	
	@GetMapping("/getallpd")
	public List<Product> getAllpd(){
		return  repo2.findAll();	
	}
	
	

}
