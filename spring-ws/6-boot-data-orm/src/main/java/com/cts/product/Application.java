package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.dao.ProductDao;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(Application.class, args);
		
		ProductDao prodDao = ac.getBean(ProductDao.class);
		
		prodDao.findAll().forEach(prod->{
			System.out.println(prod.getId());
			System.out.println(prod.getName());
			System.out.println(prod.getPrice());
			System.out.println(prod.getDescription());
			System.out.println("-----------------------------");

		});
	}

}
