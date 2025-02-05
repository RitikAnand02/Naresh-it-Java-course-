package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArbitaryRefDemo1 
{
  public static void main(String[] args) 
  {
	 List<Integer> listOfNumbers = Arrays.asList(9,5,6,2,4,1);
	 
	 //By Using Lambda Expression
	 Collections.sort(listOfNumbers, (i1,i2)-> i1.compareTo(i2));
	 System.out.println(listOfNumbers);
	 
	 //By using Method Reference
	 Collections.sort(listOfNumbers, Integer::compareTo);
	 System.out.println(listOfNumbers); 
	 
	  
	//By Using Lambda Expression
	String [] players = {"Virat", "Rohit", "Zaheer", "Rishab", "Abhishek"};
	Arrays.sort(players,(s1, s2)-> s2.compareTo(s1));	
	System.out.println(Arrays.toString(players));
	
	//By using Method Reference	
	String [] players1 = {"Virat", "Rohit", "Zaheer", "Rishab", "Abhishek"};
	Arrays.sort(players1, String::compareTo);
	System.out.println(Arrays.toString(players1));

  }
}
