package com.test;

//Count the names which are containing the character A
import java.util.Arrays;
import java.util.List;

public class CountDemo4 
{
  public static void main(String[] args) {
      List<String> list = Arrays.asList("Raj","Ravi","Rohit","Virat","Raj","Aradhya","scott");

      long count = list.stream()  
                       .map(String::toUpperCase)  
                       .filter(s -> s.contains("A"))
                       .distinct()
                       .count();

      System.out.println("Count of distinct strings containing 'A': " + count); 
  }
}