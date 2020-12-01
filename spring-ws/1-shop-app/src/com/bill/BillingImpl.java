package com.bill;

import com.pricematrix.PriceMatrix;

//Dependent
public class BillingImpl {
	
	/*
	 *  Design Issues
	 *  ----------------
	 *  => Too many dependency object creations. 
	 *  	- memory management is very difficult
	 *  	- per of apply goes down
	 *  
	 *  Why this issue happened?
	 *  -------------------------
	 *  -> Dependent class itself creating dependency object directly
	 *  
	 *  What is the solution?
	 *  -----------------------
	 *  -> Do not create dependency objects in the dependent class directly
	 *  -> Instead, use any techniques like JNDI look up.
	 *  -> JNDI location is tightly coupled with Dependent class
	 *  
	 *  What is the best solution?
	 *  ----------------------------
	 *  -> Do not create/find, instead ask some one (like containers) to inject -> IoC(Inversion of control)
	 *  
	 *  Dependency Injection (DI)
	 *  ---------------------------
	 *  
	 *  What is DI: Injecting/passing dependency object to the dependent is called DI
	 *  
	 *  How many ways DI can be implemented? : 2 ways
	 *  1.setter based DI
	 *  2.constructor based BI
	 *  
	 *  1.setter based DI
	 *  ---------------------
	 *  -> create Dependency class reference variables at class level 
	 *  -> create setter for all the dependency class references
	 * 
	 */

	private PriceMatrix price;
	 
	public void setPrice(PriceMatrix price) {
		this.price = price;
	}




	public double getCartTotal(String[] cart) {

		//PriceMatricImpl price = new PriceMatricImpl();

		double total = 0.0;

		for (String itemCode : cart) {
			total = total + price.getItemPrice(itemCode);
		}

		return total;
	}

}
