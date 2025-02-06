package com.test1;

//Finding the multiplication of all numbers

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo3
{
  public static void main(String[] args) {
      List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

      Optional<Integer> product = numbers.stream()
                                         .reduce((a, b) -> a * b);

      product.ifPresent(System.out::println); 
      
      System.out.println("==========================");
      Integer reduce = numbers.stream().reduce(1,(a,b)-> a*b);
      System.out.println(reduce);   
      
  }
}
