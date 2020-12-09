package com.cts.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@Controller
public class ProductController {

	@Autowired
	private ProductDao prodDao;

	@RequestMapping(value = "/loadForm")
	public String loadForm(Model model) {
		
		model.addAttribute("product", new Product());
		
		return "product";
	}

	@RequestMapping(value = "/find")
	public String findProduct(Model model, @RequestParam("id") int id) {

		Product product=prodDao.findById(id).orElse(null);
		if(product==null) {
			model.addAttribute("msg","Product ID doesn't found in db");
			return "redirect:/loadForm?msg=Product ID doesn't found in db";
		}
		model.addAttribute("product", product);
		return "product";
	}

}
