package com.test1;

import java.util.Optional;
import java.util.stream.Stream;

public class ReduceDemo1
{
    public static void main(String[] args) 
    {
        
       Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5); 
       Optional<Integer> reduce = integerStream.reduce(Integer::sum);
       
       reduce.ifPresent(System.out::println);
           
       
      
        
        System.out.println("==========================================");
      
        integerStream = Stream.of(1, 2, 3, 4, 5);
        Integer sumWithIdentity = integerStream.reduce(2, Integer::sum);
        System.out.println(sumWithIdentity); 
       
       
    }
}
