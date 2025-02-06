package com.test1;

import java.util.stream.Stream;

public class ForEachDemo1 {

	public static void main(String[] args)
	{
		Stream<Integer> streamOfNumbers = Stream.of(1,2,3,4,5,6,7,8,9,10);
		streamOfNumbers.forEach(System.out::println);
	}

}
