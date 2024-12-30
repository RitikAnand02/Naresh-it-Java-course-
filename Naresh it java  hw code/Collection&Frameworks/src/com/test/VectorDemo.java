package com.test;

//Program to show, How we can remove Vector object by using 
//index as well as Object as a parameter.

import java.util.Collections;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) 
	{
		Vector<String> listOfCity = new Vector<>();
		listOfCity.add("Hyderabad");
		listOfCity.add("Pune");
		listOfCity.add("Indore");
		listOfCity.add("Bhubneswar");
		listOfCity.add("Kolkata");
		
      Collections.sort(listOfCity);
      
      System.out.println(listOfCity);
      
      //Remove the element based on the index position
      listOfCity.remove(2);
      System.out.println(listOfCity);
      
      //Remove based on the Object
      listOfCity.remove("Kolkata");
      System.out.println(listOfCity);

	}

}
