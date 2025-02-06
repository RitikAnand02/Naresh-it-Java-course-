package com.test1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AnyMatchDemo1 
{
	 public static void main(String[] args) 
	 {
	        List<String> listOfName = List.of("Virat","Rohit","Bumrah","Surya");

            boolean startsWithA = listOfName.stream().anyMatch(name -> name.startsWith("A"));

	        System.out.println("Any name starts with letter 'A' : " + startsWithA);
	        
	       
	        System.out.println("================================");
	        
	        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 8);

	        Predicate<Integer> isEven = number -> number % 2 == 0;

	        boolean anyEven = numbers.stream().anyMatch(isEven);

	        if (anyEven) 
	        {
	            System.out.println("There is at least one even number.");
	        } 
	        else 
	        {
	            System.out.println("There are no even numbers.");
	        }
	        
	    }
}
