package com.test;

//Anonymous inner class

import java.util.Vector;
import java.util.function.Consumer;

public class ForEachMethodInternal1 {

	public static void main(String[] args) 
	{
		Vector<String> fruits = new Vector<>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Mango");    
		fruits.add("Banana");
		fruits.add("Gauva");  
		
		Consumer<String> cons = new Consumer<String>() 
		{			
			@Override
			public void accept(String t) 
			{
				System.out.println(t.toUpperCase());				
			}
		};
		
		fruits.forEach(cons);
	

	}

}

