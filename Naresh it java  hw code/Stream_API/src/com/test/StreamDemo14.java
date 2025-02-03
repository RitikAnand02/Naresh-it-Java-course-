package com.test;

import java.util.stream.Stream;

public class StreamDemo14 
{
 public static void main(String[] args) 
 {
	 Stream<Integer> numbers = Stream.of(10,11,9,13,2,1,100);

     numbers.takeWhile(n -> n > 9).forEach(System.out::println);     

     System.out.println(".......................");
     
    
     numbers = Stream.of(12,2,10,3,4,5,6,7,8,9);
     
     numbers.takeWhile(n -> n%2==0).forEach(System.out::println);
     
     
     System.out.println(".......................");
     
     numbers = Stream.of(1,2,3,4,5,6,7,8,9);
     
     numbers.takeWhile(n -> n < 9).forEach(System.out::println);
     
     System.out.println(".......................");
     
    
     numbers = Stream.of(11,2,13,4,5,6,7,8,9); 
     
     numbers.takeWhile(n -> n > 9).forEach(System.out::println);
     
     System.out.println(".............................");
     
     Stream<String> stream = Stream.of("Ravi", "Ankit", "Rohan", "Aman", "Ravish"); 

     stream.takeWhile(str -> str.charAt(0)=='R').forEach(System.out::println); 
     
   
   
	 
 }
}