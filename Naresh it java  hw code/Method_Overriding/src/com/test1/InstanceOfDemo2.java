package com.test1;

class Bird
{	
}

class Fish 
{	
}

public class InstanceOfDemo2 {

	public static void main(String[] args) 
	{
		Fish f = new Fish();
		
		if(f instanceof Fish)
		{
			System.out.println("f is pointing to Fish Object");
		}
		
		else if(f instanceof Bird)  //error
		{
			
		}	
		

	}

}