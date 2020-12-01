package com.pricematrix;

import org.springframework.stereotype.Repository;

@Repository
public class PriceMatricImpl implements PriceMatrix {

	public PriceMatricImpl() {
		System.out.println("--- PriceMatricImpl object created...");
	}

	@Override
	public double getItemPrice(String itemCode) {

		// code to fetch item price of given item code

		return 100.00;

	}

}
