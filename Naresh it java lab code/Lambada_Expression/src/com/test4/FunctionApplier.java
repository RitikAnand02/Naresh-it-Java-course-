package com.test4;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionApplier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<String, Integer> getStringLength = str -> str.length();
        Function<Integer, Double> divideAndFormat = num -> num / 2.0;

        System.out.print("Enter a string: ");
        String testString = scanner.nextLine();

        System.out.print("Enter an integer: ");
        int testInteger = scanner.nextInt();

        System.out.println("String length of \"" + testString + "\": " + getStringLength.apply(testString));
        System.out.println("Result of dividing " + testInteger + " by 2: " + divideAndFormat.apply(testInteger));

        scanner.close();
    }
}

