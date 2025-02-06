package com.test1;

//Join the elements by using joining() methods of Collectors class
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectDemo1
{
  public static void main(String[] args) 
  {
      List<String> list = Arrays.asList("a", "b", "c", "d");
      String result = list.stream().collect(Collectors.joining("$"));
      System.out.println(result); 
      
  }
}

