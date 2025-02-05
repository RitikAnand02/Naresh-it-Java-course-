package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MinDemo1
{
    public static void main(String[] args) 
    {
        List<Integer> listOfNumbers = Arrays.asList(10, 20, 5, 40, 25, 1);

        Optional<Integer> min = listOfNumbers.stream().min((i1,i2)-> i1.compareTo(i2));
        
       min.ifPresent(System.out::println);
        
        
       int arr[] = {1,7,9, -8};       
       IntStream stream = Arrays.stream(arr);
       OptionalInt min2 = stream.min();
       min2.ifPresent(System.out::println);
       
       }
}
