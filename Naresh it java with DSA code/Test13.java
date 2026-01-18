
// 4. Implement a program to find factorial of the given number? 
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
import java.util.*;

class Demo {
    static int fact(int n) {
        if (n == 0)
            return 1;
        else
            return n * fact(n - 1);
    }
}

class Test13 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        System.out.println(Demo.fact(n));
    }
}