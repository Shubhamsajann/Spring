package com.SpringProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringProject.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	boolean existsByName(String name);
	

}
