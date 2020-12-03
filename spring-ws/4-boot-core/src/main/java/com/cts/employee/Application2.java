package com.cts.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication // Auto Configuration
//@ComponentScan("com.cts.product,com.cts.employee") // very dangerous ... // Auto COnfigutaion is disabled.
public class Application2 {

	public static void main(String[] args) {

		
		System.out.println("--- before");
		
		SpringApplication.run(Application2.class,args);
		

		
		

	}

}
