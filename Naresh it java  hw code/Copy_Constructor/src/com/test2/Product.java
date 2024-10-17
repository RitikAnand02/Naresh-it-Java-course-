package com.test2;

public class Product {
	private int productId;
	private String productName;

	public Product(int productId, String productName) 
	{
		super();
		this.productId = productId;
		this.productName = productName;
	}
	
	public Product(Product prod) //Parameterized Constructor
	{
		this.productId = prod.productId;
		this.productName = prod.productName;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}

}
