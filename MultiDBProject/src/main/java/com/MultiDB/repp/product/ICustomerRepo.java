package com.MultiDB.repp.product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MultiDB.model.customer.Customer;

public interface ICustomerRepo extends JpaRepository<Customer,Integer> {
	

}
