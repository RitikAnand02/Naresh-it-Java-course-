// IMPLEMENT A PROGRAM/ALG TO GENERATE FIBNOCCI NUMBERS 

import java.util.ArrayList;

class Demo {
    
    static ArrayList<Integer> getFibonacciNums(int n) {
        int a, b, c, i;
        ArrayList<Integer> al = new ArrayList<Integer>();
        a = 0;
        b = 1;
        al.add(a);
        al.add(b);
        for (i = 1; i <= n - 2; i++) {
            c = a + b;
            al.add(c);
            a = b;
            b = c;
        }
        return al;
    }
}

class Test7 {
    public static void main(String[] args) {
        java.util.Scanner obj = new java.util.Scanner(System.in);
        System.out.println("Enter n value");
        int n = obj.nextInt();
        System.out.println(Demo.getFibonacciNums(n));
    }
}