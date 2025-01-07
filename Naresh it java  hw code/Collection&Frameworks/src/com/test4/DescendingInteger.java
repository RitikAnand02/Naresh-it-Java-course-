package com.test4;

//How to sort Integer Object in descending Order by using 
//Comparator interface.


import java.util.ArrayList;
import java.util.Collections;

public class DescendingInteger {

	public static void main(String[] args) 
	{
		ArrayList<Integer> listOfNumber = new ArrayList<>();
		listOfNumber.add(56);
		listOfNumber.add(34);
		listOfNumber.add(12);
		listOfNumber.add(9);
		listOfNumber.add(99);
		
		Collections.sort(listOfNumber,(i1,i2)-> i2.compareTo(i1));
		System.out.println(listOfNumber);
		

	}

}
