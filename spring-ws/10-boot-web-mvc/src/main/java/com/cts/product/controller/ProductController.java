package com.cts.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@Scope("request")
//@SessionAttributes(value = {"s1","s2","s3"})
public class ProductController {

	@RequestMapping(value = "/s1")
	public void f1() {
		// 1. Model / data
		// 2. View / template
		// 3. ModelAndView

		System.out.println("--- ProductController f1 method...");
	}

	@RequestMapping(value = "/s2")
	public void f2() {
		// 1. Model / data
		// 2. View / template
		// 3. ModelAndView

		System.out.println("--- ProductController f2 method...");
	}

	@RequestMapping("/s3")
	public String f3() {
		return "one";
	}

	@RequestMapping(value = "/s4")
	public String f4(Model model) {

		String userName = "Praveen";
		model.addAttribute("user", userName); // request object scope

		return "two";
	}

	@RequestMapping(value = "/s5")
	public ModelAndView f5() {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("two");
		mav.addObject("user", "Bucky Wall");

		return mav;

	}

}
