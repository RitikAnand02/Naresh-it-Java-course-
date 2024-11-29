package com.test2;

import java.util.Scanner;
import java.util.function.Consumer;

public class ValueModifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String> stringConsumer = str -> {
            System.out.println("After converting string to uppercase: " + str.toUpperCase());
        };

        Consumer<Integer> integerConsumer = num -> {
            System.out.println("After squaring the integer: " + (num * num));
        };

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter an integer: ");
        int inputInteger = scanner.nextInt();

        System.out.println("Original string: " + inputString);
        System.out.println("Original integer: " + inputInteger);

        stringConsumer.accept(inputString);
        integerConsumer.accept(inputInteger);

        scanner.close();
    }
}

