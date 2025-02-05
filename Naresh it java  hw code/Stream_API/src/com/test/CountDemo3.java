package com.test;

//Count Unique elements by using Stream API
import java.util.List;

public class CountDemo3
{
  public static void main(String[] args) {
  	List<String> listOfName = List.of("Raj","Raj","Ravi","Virat","Raj");

      long count = listOfName.stream()
                       .distinct()
                       .count();

      System.out.println("Count of unique elements: " + count); 
  }
}

