package com.test1;

//Group the city name according to length of the city name
import java.util.*;
import java.util.stream.Collectors;

public class CollectDemo2
{
  public static void main(String[] args) 
  {
      List<String> items = Arrays.asList("Delhi", "Indore", "Kolkata", "Pune", "Hyderabad","Mumbai","Chennai");

      Map<Integer, List<String>> collect = items.stream().collect(Collectors.groupingBy(String::length));
    
      collect.forEach((len, cities)-> System.out.println(len+ " :"+cities));
      
   
  }
}
