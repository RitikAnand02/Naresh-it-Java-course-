package com.test2;

public class ProductDemo {

	public static void main(String[] args) {

		Product p1 = new Product();
		accept(p1);
		System.out.println(p1.getProductPrice());

	}
	public static void accept(Product prod)
	{
		prod = new Product();
		prod.setProductPrice(15000);
	}

}

//Note : Here another object is created and it is assigned to prod variable (deep copy) so the changes will done in the 
//newly created object but not the existing object so, the output is 2000.
