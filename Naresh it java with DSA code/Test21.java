// 11. Implement a program to find nth fib number.

import java.util.*;

class Demo {
    static int fib(int n) {
        if (n == 0 || n == 1)
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }
}

class Test21 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(Demo.fib(i) + ", ");
        }
    }
}
