
// 06. Implement a program to check whether the given number is prime number 
// or not? 

import java.util.*;

class Demo {
    static boolean isprime(int n, int i) {
        if (i == 1)
            return true;
        else if (n % i == 0)
            return false;
        else
            return isprime(n, --i);

    }
}

class Test15 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter n value:");
        int n = obj.nextInt();
        System.out.println(Demo.isprime(n, n / 2));// true or false
    }
}
