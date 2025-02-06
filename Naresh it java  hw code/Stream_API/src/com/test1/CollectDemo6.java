package com.test1;

//Partition the given number based on the Predicate and convert to Set

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectDemo6
{
  public static void main(String[] args) 
  {
      List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 3);

      Map<Boolean, Set<Integer>> partitioned = numbers.stream()
          .collect(Collectors.partitioningBy(
              n -> n % 2 == 1,
              Collectors.toSet()));

      System.out.println(partitioned);
      
  }
}