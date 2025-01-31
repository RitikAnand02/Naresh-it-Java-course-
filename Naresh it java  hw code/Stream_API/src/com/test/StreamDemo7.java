package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
 
public class StreamDemo7 
{
    public static void main(String[] args) 
    {
       List<Integer> listOfNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);  
       //add a constant value 10 to all the numbers
       
       List<Integer> numbers = listOfNumbers.stream().map(num -> num+10).collect(Collectors.toList());
       
       System.out.println(numbers);
       
       System.out.println(".................................");
       
      List<Integer> immutableList = List.of(1,2,3,4,5,6,7,8,9,10,2,3,4,6,8);
      
      //Fetch all the unique even numbers and find the cube of those numbers
      System.out.println("Cube of all the even numbers :");
       immutableList.stream().distinct().filter(num -> num%2==0).map(n -> n*n*n).forEach(System.out::println);
      
          
    }
}
