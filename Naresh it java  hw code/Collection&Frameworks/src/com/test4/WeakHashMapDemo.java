package com.test4;

import java.util.WeakHashMap;

record Product1(Integer productId, String productName)
{
		
	@Override
	public void finalize()
	{
	   System.out.println("Product Object is eligible for GC" );	
	}
}

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		Product1 p1 = new Product1(111, "Camera");
		
		WeakHashMap<Product1,String> product = new WeakHashMap<>();
		product.put(p1, "Hyderabad");
		
		System.out.println(product);
		
		p1 = null;
		
		System.gc();
		
		Thread.sleep(3000);
		
		System.out.println(product); //{}
		

	}

}

//Note : Here Product object and WeakHashMap entry both will be 
//       deleted because keys are weak type.
//       It is suitable for database inventory where we want frequently delete the Product Object.
