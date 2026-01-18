//  DESIGN A PROGRAM TO FIND SUM OF 'N' NATURAL NUMBERS: 
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 

import java.util.*;

class Demo {
    static int sumofn_v1(int n) {
        // for loop
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    static int sumofn_v2(int n) {
        // recursion
        if (n == 0)
            return 0;
        else
            return n + sumofn_v2(n - 1);
    }

    static int sumofn_v3(int n) {
        // math formula
        return (n * (n + 1)) / 2;
    }
}

class Test3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter n value");
        int n = obj.nextInt();
        System.out.println(Demo.sumofn_v1(n));
        System.out.println(Demo.sumofn_v2(n));
        System.out.println(Demo.sumofn_v3(n));
    }
}
