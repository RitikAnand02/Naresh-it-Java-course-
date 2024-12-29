package com.test;

//By using Lambda

import java.util.Vector;
import java.util.function.Consumer;

public class ForEachMethodInternal2 {

	public static void main(String[] args) 
	{
		Vector<String> fruits = new Vector<>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Mango");    
		fruits.add("Banana");
		fruits.add("Gauva");  
		
   Consumer<String> cons = str-> System.out.println(str.toUpperCase());
   
   fruits.forEach(cons);

	}

}

