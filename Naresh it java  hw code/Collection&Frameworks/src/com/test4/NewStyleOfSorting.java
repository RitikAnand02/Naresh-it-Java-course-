package com.test4;

import java.util.ArrayList;

public class NewStyleOfSorting {

	public static void main(String[] args) 
	{
		ArrayList<Integer> listOfNumber = new ArrayList<>();
		listOfNumber.add(56);
		listOfNumber.add(34);
		listOfNumber.add(12);
		listOfNumber.add(9);
		listOfNumber.add(99);
		
		listOfNumber.sort((i1,i2)-> i1.compareTo(i2));
		
		System.out.println(listOfNumber);
		
		ArrayList<String> listOfCity = new ArrayList<>();		
		listOfCity.add("Ajmer");
		listOfCity.add("Mubai");
		listOfCity.add("Bhubneswar");
		listOfCity.add("Chennai");
		listOfCity.add("Hyderabad");
		
		listOfCity.sort((s1,s2)-> s2.compareTo(s1));
		System.out.println(listOfCity);

	}
}
