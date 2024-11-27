package com.test1;

import java.util.function.*;
public class BiPredicate1 
{
	public static void main(String[] args)   
    {
        BiPredicate<String, Integer> filter = (x, y) -> 
		{
            return x.length() == y;  
        };

        boolean result = filter.test("Ravi", 4);
        System.out.println(result);  

        result = filter.test("Hyderabad", 10);
        System.out.println(result);
	}
}
