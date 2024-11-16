package com.test1;

class Alpha2
{
}
class Beta2 extends Alpha2
{
}
public class InstanceOfOperator1 
{
	public static void main(String[] args) 
	{
		Beta2 b = new Beta2();
		
		if(b instanceof Alpha2)
		{
			System.out.println("b is pointing to Beta obj");
		}
		
	}
	
	
}