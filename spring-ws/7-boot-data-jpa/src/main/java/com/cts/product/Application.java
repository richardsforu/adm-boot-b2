package com.cts.product;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(Application.class, args);
		
		ProductDao prodDao = ac.getBean(ProductDao.class);
		
		
		/*prodDao.findAll().forEach(prod->{
			System.out.println(prod.getId());
			System.out.println(prod.getName());
			System.out.println(prod.getPrice());
			System.out.println(prod.getDescription());
			System.out.println("------------------------------");

		}); */
		
		/*
		Product prod = prodDao.findById(22).orElse(null);
		
		if(prod!=null) {
			System.out.println(prod.getId());
			System.out.println(prod.getName());
			System.out.println(prod.getPrice());
			System.out.println(prod.getDescription());
			System.out.println("------------------------------");
		}else {
			System.out.println("Product Id Doesn't exists in database.....");
		}
		*/
		
		
		Product product=new Product();
		product.setId(24);
		product.setName("Game");
		product.setDescription("Inter Gaming laptop");
		product.setPrice(12500);
		
		//prodDao.save(product);
		
		/*
		
		Product prod = prodDao.findById(14).orElse(null);
		prod.setName("Laptop Bag");
		prod.setDescription("Sangonite Laptop Bag");
		prod.setPrice(12000);
		
		prodDao.save(prod);
		
		*/
		
		/*
		
		prodDao.findByNameLike("%a%").forEach(prod->{
			System.out.println(prod.getId());
			System.out.println(prod.getName());
			System.out.println(prod.getPrice());
			System.out.println(prod.getDescription());
			System.out.println("------------------------------");
		});
		
		*/
		
	/*
		prodDao.findByPriceGreaterThan(10000).forEach(prod->{
			System.out.println(prod.getId());
			System.out.println(prod.getName());
			System.out.println(prod.getPrice());
			System.out.println(prod.getDescription());
			System.out.println("------------------------------");
		});
	*/
		
		
		/*
		
	
		prodDao.findByPriceBetween(15000, 40000).forEach(prod->{
			System.out.println(prod.getId());
			System.out.println(prod.getName());
			System.out.println(prod.getPrice());
			System.out.println(prod.getDescription());
			System.out.println("------------------------------");
		});
		
		*/
		
	/*	prodDao.findByPriceGreaterThanAndNameLike(15000, "Laptop%").forEach(prod->{
			System.out.println(prod.getId());
			System.out.println(prod.getName());
			System.out.println(prod.getPrice());
			System.out.println(prod.getDescription());
			System.out.println("------------------------------");
		});
		*/
		
			
		
		
		/*
		Product prod=prodDao.findByPriceEquals(12000);
		System.out.println(prod.getId());
		System.out.println(prod.getName());
		System.out.println(prod.getPrice());
		System.out.println(prod.getDescription());
		System.out.println("------------------------------");
		
		*/
		
		
		
		
		
		
		
		
		
		
		
	}

}
