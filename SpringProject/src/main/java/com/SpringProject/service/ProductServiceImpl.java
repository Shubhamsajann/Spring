package com.SpringProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringProject.entities.Product;
import com.SpringProject.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
private	ProductRepository repo;

	@Override
	public Product addProduct(Product product) {
		if(repo.existsByName(product.getName())){
			throw new  RuntimeException("Product already exists!");	
			
		}
		return repo.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
	
		return repo.findAll();
	}

	@Override
	public Product updateProduct(Long id, Product product) {
		Optional<Product> optinal  = repo.findById(id);
		if(!optinal.isPresent()) {
			throw new RuntimeException("Product not found!");
		}
		Product existing =  optinal.get();
		existing.setName(product.getName());
		existing.setPrice(product.getPrice());
        existing.setDescription(product.getDescription());
        existing.setCategory(product.getCategory());
        return repo.save(existing);
	}

	@Override
	public void deleteProduct(Long id) {
	
		repo.deleteById(id);
		
	}

}
