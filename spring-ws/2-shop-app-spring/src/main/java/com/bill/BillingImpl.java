package com.bill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pricematrix.PriceMatrix;

@Service
public class BillingImpl {
	
	

	@Autowired
	private PriceMatrix price;
	
	
	public double getCartTotal(String[] cart) {

		//PriceMatricImpl price = new PriceMatricImpl();

		double total = 0.0;

		for (String itemCode : cart) {
			total = total + price.getItemPrice(itemCode);
		}

		return total;
	}

}
