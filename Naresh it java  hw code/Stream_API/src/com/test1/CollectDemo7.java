package com.test1;

//Count how many elements are partition based on given predicate  

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectDemo7 
{
  public static void main(String[] args) 
  {
      List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);

      Map<Boolean, Long> partitioned = numbers.stream()
          .collect(Collectors.partitioningBy
           (
              n -> n % 2 == 1,
              Collectors.counting()));

      System.out.println(partitioned);
      
  }
}
