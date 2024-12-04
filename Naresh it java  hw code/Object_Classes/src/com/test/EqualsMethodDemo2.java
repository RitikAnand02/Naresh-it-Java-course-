package com.test;

class Product 
{
	private int productId;
	private String productName;

	public Product(int productId, String productName) 
	{
		super();
		this.productId = productId;
		this.productName = productName;
	}
	
	@Override
	public int hashCode()
	{
		return productId;
	}
		
	
	@Override
	public boolean equals(Object obj) //obj = p2
	{
		//Fetching first object content
		int pid1 = this.productId;
		String pname1 =this.productName; 
		
		//Fetching 2nd object content
		Product p2 = (Product) obj;
		
		int pid2 = p2.productId;
		String pname2 = p2.productName;
		
		if(pid1 == pid2 && pname1.equals(pname2))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}	
}
public class EqualsMethodDemo2 
{
	public static void main(String[] args) 
	{
		Product p1 = new Product(111, "Camera");
		Product p2 = new Product(111, "Camera");
		
		System.out.println(p1.equals(p2));			
	}

}

//Note : In the above program we are comparing two Product object based on the content by overriding equals(Object obj) from object class.

