package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

public class FlatMapToDoubleDemo1
{
    public static void main(String[] args)
    {
    	double d1[] = new double[]{1.1, 1.2, 1.3};
    	double d2[] = new double[]{2.1, 2.2, 2.3};
    	double d3[] = new double[]{3.1, 3.2, 3.3};
        
    	List<double[]> listOfDoubleArrays = Arrays.asList(d1,d2,d3);
          
            DoubleStream doubleStream = listOfDoubleArrays.stream()
                .flatMapToDouble(array -> DoubleStream.of(array));

            // Print each double value in the flattened stream
            doubleStream.forEach(System.out::println);
        }
}
