package com.test1;

//Print the length of the country
import java.util.*;
import java.util.stream.Collectors;

public class CollectDemo3
{
  public static void main(String[] args) 
  {
     List<String> listOfCountry = List.of("India","Australia","USA","China","Japan");

      Map<String, Integer> map = listOfCountry.stream()
              .collect(Collectors.toMap(
                      countryName -> countryName,            
                      countryName -> countryName.length()  
              ));

      map.forEach((key, value) -> 
      {
          System.out.println(key + ": " + value);
      });
  }
}
