package com.cts.product.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.product.entity.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {
	
	

	// DSL -> Domain specific Language
	
	List<Product> findProductByNameLike(String name);

	List<Product> findByNameLike(String str);

	List<Product> findByPriceGreaterThan(double range);

	List<Product> findByPriceBetween(double startRange, double endRange);

	List<Product> findByPriceGreaterThanAndNameLike(double price, String name);

	Product findByPriceEquals(double price);

}
