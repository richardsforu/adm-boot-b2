package com.cts.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDaoImpl;

@Service
public class ProductServiceImpl {
	
	@Value("${name}")
	private String empName;
	
	@Value("#{100+200}")
	private int sum;
	
	


	public ProductDaoImpl getDao() {
		return dao;
	}

	public void setDao(ProductDaoImpl dao) {
		this.dao = dao;
	}

	@Autowired
	private ProductDaoImpl dao;
	
	public void  f1() {
		System.out.println("Employee Name: "+empName);
		System.out.println("Sum: "+sum);
		dao.f2();
		System.out.println("ProductService Impl f1");
	}

}
