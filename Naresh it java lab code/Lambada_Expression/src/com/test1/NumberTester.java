package com.test1;

import java.util.Scanner;
import java.util.function.Predicate;

public class NumberTester {
    public static void testPredicate(int number, Predicate<Integer> predicate, String description) {
        boolean result = predicate.test(number);
        System.out.println("Is " + number + " " + description + "? " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<Integer> isEven = number -> number % 2 == 0;
        Predicate<Integer> isPrime = number -> {
            if (number <= 1) return false;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) return false;
            }
            return true;
        };

        
        System.out.print("Enter a number to test: ");
        int number = scanner.nextInt();

        
        testPredicate(number, isEven, "even");
        testPredicate(number, isPrime, "prime");

        scanner.close();
    }
}


