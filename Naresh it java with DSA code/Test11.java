
// 02. Implement a program to calculate sum of 'n' natural numbers 
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
import java.util.*;

class Demo {
    static int sum(int n) {
        if (n == 1)
            return 1;
        else
            return n + sum(n - 1);
    }
}

class Test11 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        System.out.println(Demo.sum(n));
    }
}