package com.SpringProject.repository;

import com.SpringProject.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
	
	//helps us check duplicate category
	boolean existsByName(String name);

}
