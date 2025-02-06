package com.test1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo4
{
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "is", "Best");

        Optional<String> concatenated = words.stream()
                                             .reduce((a, b) -> a + " " + b);

        concatenated.ifPresent(System.out::println); 
      }
}
