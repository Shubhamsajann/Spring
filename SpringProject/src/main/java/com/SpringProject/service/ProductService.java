package com.SpringProject.service;

import java.util.List;

import com.SpringProject.entities.Product;

public interface ProductService {
	
	Product addProduct(Product product);
	List<Product> getAllProducts();
	Product updateProduct(Long id,Product product);
	void  deleteProduct(Long id);

	
}
