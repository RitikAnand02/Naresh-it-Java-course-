package com.test1;

import java.util.stream.Stream;

public class FindFirstDemo1 
{
   public static void main(String[] args) 
   {
	   Stream<String> playerName = Stream.of("Virat", "Rohit", "Raj", "Bumrah", "Arshdeep");

       
	   playerName.findFirst().ifPresent(System.out::println);
   }
}


