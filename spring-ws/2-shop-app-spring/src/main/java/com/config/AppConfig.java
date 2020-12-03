package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.pricematrix,com.bill"})
public class AppConfig {
	
	
	@Bean
	public void f1() {
		System.out.println("-- step1 : data source");
	}
	
	@Bean
	public void f2() {
		System.out.println("-- step2 : session factory");
	}
	
	@Bean
	public void f3() {
		System.out.println("-- step3 : transaction manager");
	}

}
