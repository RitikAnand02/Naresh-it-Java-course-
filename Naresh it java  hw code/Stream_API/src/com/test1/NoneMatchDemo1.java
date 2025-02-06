package com.test1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class NoneMatchDemo1 
{
  public static void main(String[] args) 
  {
	  List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9);

      Predicate<Integer> isEven = number -> number % 2 == 0;

      
      boolean noneEven = numbers.stream().noneMatch(isEven);
         

      
      if (noneEven) 
      {
          System.out.println("There are no even numbers.");
      }
      else 
      {
          System.out.println("There is at least one even number.");
      }
}
}