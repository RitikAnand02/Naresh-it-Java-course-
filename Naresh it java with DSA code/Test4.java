// IMPLEMENT A PROGRAM TO READ THREE NUMBERS FROM THE USER AND CAL MAX OF 
// THREE NUMBERS 

import java.util.*;

class Demo {
    static int max1(int a, int b, int c) {
        return (a > b && a > c) ? a : (b > c ? b : c);
    }

    static int max2(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}

class Test4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a value");
        int a = obj.nextInt();
        System.out.println("Enter b value");
        int b = obj.nextInt();
        System.out.println("Enter c value");
        int c = obj.nextInt();
        System.out.println(Demo.max1(a, b, c));
        System.out.println(Demo.max2(a, b, c));
    }
}
