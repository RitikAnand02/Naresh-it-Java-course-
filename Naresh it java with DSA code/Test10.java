
// 01. Implement a program to print natural numbers from 1 to n 
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
import java.util.*;

class Demo {
    static void print(int n) {
        if (n >= 1) {
            // System.out.print(n+" "); ===> n, n-1, n-2, ... 1
            print(n - 1);
            System.out.print(n + " "); // ==> 1, 2, 3, 4, .... n
        }
    }
}

class Test10 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        Demo.print(n);
    }
}
