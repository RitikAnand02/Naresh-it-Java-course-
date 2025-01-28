package com.test5;

import java.util.*;
public class TypeErasureDemo 
{
	public static void main(String[] args) 
	{
		
	}
	
	public void accept(List<String> listOfString)
	{
	}
	
	public void accept(List<Integer> listOfInteger)
	{
	}
}

//Note : In the above program we will get compilation error because
//       generic information does not exist at runtime so method overloading is not possible.