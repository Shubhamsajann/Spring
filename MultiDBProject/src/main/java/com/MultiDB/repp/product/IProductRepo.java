package com.MultiDB.repp.product;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MultiDB.model.product.Product;

public interface IProductRepo extends JpaRepository<Product, Integer> {

}
