package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bill.BillingImpl;
import com.config.AppConfig;

public class Test {

	public static void main(String[] args) {

		String[] cart1 = { "P001", "P002", "P003" };
		String[] cart2 = { "P001", "P002" };

		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		BillingImpl biller=ac.getBean(BillingImpl.class);
		
		//biller.setPrice(price); // Injecting/passing dependency obj (price) the dependent obj (biller)
		
		double total = biller.getCartTotal(cart1);

		System.out.println("Cart1 Total: " + total);

		total = biller.getCartTotal(cart2);

		System.out.println("Cart2 Total: " + total);

	}

}
