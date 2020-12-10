package com.cts.product.controller;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {
	
	@GetMapping
	public String f1() {
		return "GET Mapping data";
	}
	
	@PostMapping
	public String f2() {
		return "POST Mapping data";
	}
	
	@PutMapping
	public String f3() {
		return "PUT Mapping data";
	}
	
	
	@PatchMapping
	public String f4() {
		return "PATCH Mapping data";
	}
	
	@DeleteMapping
	public String f5() {
		return "DELETE Mapping data";
	}

}
