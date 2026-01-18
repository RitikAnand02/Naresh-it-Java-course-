// IMPLEMENT A PROGRAM/ALG TO GENERATE TRIBONACCI NUMBERS 
// --------------- 
import java.util.*;

class Demo {
    static ArrayList<Integer> getTribonacciNums(int n) {
        int a, b, c, d, i;
        ArrayList<Integer> al = new ArrayList<Integer>();
        a = 0;
        b = 1;
        c = 2;
        al.add(a);
        al.add(b);
        al.add(c);
        for (i = 1; i <= n - 3; i++) {
            d = a + b + c;
            al.add(d);
            a = b;
            b = c;
            c = d;
        }
        return al;
    }
}

class Test8 {
    public static void main(String[] args) {
        java.util.Scanner obj = new java.util.Scanner(System.in);
        System.out.println("Enter n value");
        int n = obj.nextInt();
        System.out.println(Demo.getTribonacciNums(n));
    }
}