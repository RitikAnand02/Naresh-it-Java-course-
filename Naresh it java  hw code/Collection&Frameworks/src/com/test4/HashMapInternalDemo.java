package com.test4;

import java.util.HashMap;

record Customer2(Integer id, String name)
{
	
}

public class HashMapInternalDemo 
{

	public static void main(String[] args) 
	{
	   Customer2 c1 = new Customer2(111, "Scott");	
	   Customer2 c2 = new Customer2(111, "Scott");	
	   	   
	   //System.out.println(c1.hashCode()+" : "+c2.hashCode());
	    
	   HashMap<Customer2,String> map = new HashMap<>();
	   map.put(c1, "A");
	   map.put(c2, "B");
	   
	   System.out.println(map.size());
	}

}

//so final conclusion is, In our user-defined class which we want to use as a HashMap key must be immutable and hashCode() and equals(Object obj) method must be overridden. Instead of BLC class we can also use simply record because record is implicitly final and hashCode() and equals(Object obj) methods are overridden.
