package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product 
{
	private Integer productId;
	private List<String> listOfProducts;

	public Product(Integer productId, List<String> listOfProducts)       
	{
		super();
		this.productId = productId;
		this.listOfProducts = listOfProducts;

	}

	public Integer getProductId() 
	{
		return productId;
	}

	public List<String> getListOfProducts() 
	{
		return listOfProducts;
	}	
}

public class FlatMapDemo3 
{
	public static void main(String[] args) 
	{
		List<Product> listOfProduct = Arrays.asList(
	new Product(1, Arrays.asList("Camera", "Mobile", "Laptop")),
	new Product(2, Arrays.asList("Bat", "Ball", "Wicket")),
	new Product(3, Arrays.asList("Chair", "Table", "Lamp")),
	new Product(4, Arrays.asList("Cycle", "Bike", "Car"))

		);
		
		List<String> collect = listOfProduct.stream().flatMap(product -> product.getListOfProducts().stream()).collect(Collectors.toList());

		System.out.println(collect);
		
	}

}
