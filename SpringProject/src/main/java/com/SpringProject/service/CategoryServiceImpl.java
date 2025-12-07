package com.SpringProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.SpringProject.entities.Category;
import com.SpringProject.repository.CategoryRepository;
import com.SpringProject.entities.Category;



@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryRepository repo;
	
	
	

	  @Override
	    public Category addCategory(Category category) {
	        if (repo.existsByName(category.getName())) {
	            throw new RuntimeException("Category already exists!");
	        }
	        return repo.save(category); // Save category to DB
	    }

	  
	@Override
	public List<Category> getAllCategories() {
		return repo.findAll();

	}

	@Override
	public Category updateCategory(Long id, Category category) {
	    Optional<Category> optional = repo.findById(id);

	    // 1. Check if category exists
	    if (!optional.isPresent()) {
	        System.out.println("Category not found!");
	        return null; // or throw exception
	    }

	    // 2. Get existing category
	    Category existing = optional.get();

	    // 3. Update the name
	    existing.setName(category.getName());

	    // 4. Save updated entity
	    return repo.save(existing);
	}


	@Override
	public void deleteCategory(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}
	
	

}
