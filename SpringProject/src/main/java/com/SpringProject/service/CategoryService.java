package com.SpringProject.service;

import java.util.List;

import com.SpringProject.entities.Category;


public interface CategoryService {
	
	com.SpringProject.entities.Category addCategory(Category category);
	List<Category> getAllCategories();
	Category updateCategory (Long id,Category category);
	void deleteCategory(Long id);
	

}
