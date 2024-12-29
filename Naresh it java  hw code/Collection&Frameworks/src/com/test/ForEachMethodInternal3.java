package com.test;

//Assigning Lambda to the Consumer Functional interface :

import java.util.Vector;

public class ForEachMethodInternal3 {

	public static void main(String[] args) 
	{
		Vector<String> fruits = new Vector<>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Mango");    
		fruits.add("Banana");
		fruits.add("Gauva");      
     
     fruits.forEach(str-> System.out.println(str.toUpperCase()));

	}

}
