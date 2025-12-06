package com.mongo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.model.Customer;

public interface ICustomerRepo extends MongoRepository<Customer,String> {
	 

}
