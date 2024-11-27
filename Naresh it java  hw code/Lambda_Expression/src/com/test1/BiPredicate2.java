package com.test1;

import java.util.function.BiPredicate;

public class BiPredicate2
{
  public static void main(String[] args) 
  {
    // BiPredicate to check if the sum of two integers is even
    BiPredicate<Integer, Integer> isSumEven = (a, b) -> (a + b) % 2 == 0;

        System.out.println(isSumEven.test(2, 3));    
        System.out.println(isSumEven.test(5, 7));   
    }
}
