// 13) Implement a program to find HCF/GCD of the given two numbers 

import java.util.*;

class Demo {
    static int gcd(int a, int b) {
        while (a != b) {
            if (a > b)
                return gcd(a - b, b);
            else
                return gcd(a, b - a);
        }
        return a;
    }
}

class Test23 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter n1 value:");
        int n1 = obj.nextInt();
        System.out.println("Enter n2 value:");
        int n2 = obj.nextInt();
        System.out.println(Demo.gcd(n1, n2));
    }
}