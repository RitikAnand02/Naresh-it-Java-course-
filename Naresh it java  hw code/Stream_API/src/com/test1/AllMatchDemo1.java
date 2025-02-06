package com.test1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class AllMatchDemo1 {

	public static void main(String[] args) 
	{
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
		
        boolean allPositive = stream.allMatch(n -> n > 0);
        System.out.println("All elements are positive: " + allPositive);
                
        System.out.println("...........................");
        
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11);

        Predicate<Integer> isEven =  number -> number % 2 == 0;

        boolean allEven = numbers.stream().allMatch(isEven);

        if (allEven) 
        {
            System.out.println("All numbers are even.");
        }
        else 
        {
            System.out.println("Not all numbers are even.");
        }
       
	}

}
