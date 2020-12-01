package com.pricematrix;

//Dependency
public class PriceMatricImpl implements PriceMatrix {
	
	public PriceMatricImpl() {
		System.out.println("--- PriceMatricImpl object created...");
	}
	
	/*
	 * 
	 * Types of Objects : 2 types
	 * 1. Dependency : Works independently
	 * 2. Dependent  : always depends on dependency objects
	 * 
	 * 
	 */

	@Override
	public double getItemPrice(String itemCode) {

		// code to fetch item price of given item code

		return 100.00;

	}

}
