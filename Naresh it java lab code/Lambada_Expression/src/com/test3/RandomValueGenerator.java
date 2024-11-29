package com.test3;

import java.util.Random;
import java.util.function.Supplier;

public class RandomValueGenerator {

    public static void main(String[] args) {
        Random random = new Random();

        Supplier<String> stringSupplier = () -> {
            int randomNumber = random.nextInt(10000);  
            return String.format("NIT%04d", randomNumber); 
        };

        Supplier<Integer> integerSupplier = () -> {
            int min = 10; 
            int max = 100; 
            return random.nextInt(max - min + 1) + min; 
        };

        System.out.println("Generated random string: " + stringSupplier.get());
        System.out.println("Generated random integer: " + integerSupplier.get());
    }
}

