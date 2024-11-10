//Program that describes that var args must be only one and last argument

package com.test7;

public class Test 
{
	// All commented codes are invalid
	
	/*
	 * public void accept(float ...x, int ...y) { }
	 * 
	 * public void accept(int ...x, int y) { }
	 * 
	 * public void accept(int...x, int ...y) {}
	 */
	  
	 
	public void accept(int x, int... y) // valid
	{
		System.out.println("x value is :" + x);
		
		for (int z : y) 
		{
			System.out.println(z);
		}
	}
}
