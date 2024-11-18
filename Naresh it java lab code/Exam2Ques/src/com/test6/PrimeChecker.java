package com.test6;

public class PrimeChecker {
    
    private int number;
    
    public PrimeChecker(int number) {
        this.number = number;
    }

    public boolean isPrime() {
        if (number <= 1) {
            return false; 
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; 
            }
        }
        return true; 
    }

    public void printResult() {
        System.out.println("Is " + number + " a prime number?");
        if (isPrime()) {
            System.out.println("Yes, it is a prime number.");
        } else {
            System.out.println("No, it is not a prime number.");
        }
    }


}

