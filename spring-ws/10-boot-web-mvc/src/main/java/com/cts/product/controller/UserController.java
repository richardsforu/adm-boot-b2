package com.cts.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping(value = "/s11")
	public void f111() {
		System.out.println(">>>>> UserController <<<<<< f1 method");
	}

}
