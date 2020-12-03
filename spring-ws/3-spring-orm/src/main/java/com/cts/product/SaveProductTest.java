package com.cts.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

public class SaveProductTest {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		Product product = new Product();

		product.setId(22);
		product.setName("Mobile");
		product.setPrice(55000);
		product.setDescription("One Plus 8T");

		ProductService ps = ac.getBean(ProductService.class);
		//ps.save(product);
		
		/*ps.findAll().forEach(prod->{
			System.out.println(prod.getId());
			System.out.println(prod.getName());
			System.out.println(prod.getPrice());
			System.out.println(prod.getDescription());
			System.out.println("---------------------------");
		});*/
		
		Product prod=ps.findById(22);
		
		System.out.println(prod.getId());
		System.out.println(prod.getName());
		System.out.println(prod.getPrice());
		System.out.println(prod.getDescription());
		System.out.println("---------------------------");
	}

}
