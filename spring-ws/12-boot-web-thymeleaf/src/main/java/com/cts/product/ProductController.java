package com.cts.product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	
	@RequestMapping("/s1")
	public String f1(Model model) {
		
		model.addAttribute("userName", "Richards");
		return "one";
	}

}
