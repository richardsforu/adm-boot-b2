package com;

import com.bill.BillingImpl;
import com.pricematrix.PriceMatricImpl;
import com.pricematrix.PriceMatrix;

public class Test {

	public static void main(String[] args) {

		String[] cart1 = { "P001", "P002", "P003" };
		String[] cart2 = { "P001", "P002" };

		//--------------------------------------------
		PriceMatrix price=new PriceMatricImpl(); // dependency
		//--------------------------------------------
		
		BillingImpl biller = new BillingImpl(); // dependent
		
		biller.setPrice(price); // Injecting/passing dependency obj (price) the dependent obj (biller)
		
		double total = biller.getCartTotal(cart1);

		System.out.println("Cart1 Total: " + total);

		total = biller.getCartTotal(cart2);

		System.out.println("Cart2 Total: " + total);

	}

}
