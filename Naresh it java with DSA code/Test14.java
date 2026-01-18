
// 05. Implement a program to calculate product of two integer values (a*b) 
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 

import java.util.*;

class Demo {
    static int product(int a, int b) {
        if (a < b)
            return product(b, a);
        else if (b != 0)
            return a + product(a, b - 1);
        else
            return 0;
    }
}

class Test14 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a value:");
        int a = obj.nextInt();
        System.out.println("Enter b value:");
        int b = obj.nextInt();
        System.out.println(Demo.product(a, b));
    }
}
