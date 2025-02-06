package com.test1;

//Finding the maximum number 

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo2
{
  public static void main(String[] args) {
      List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

      Optional<Integer> max = numbers.stream()
                                     .reduce(Integer::max);

      max.ifPresent(System.out::println); 
  }
}
