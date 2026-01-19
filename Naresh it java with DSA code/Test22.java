
// 12) Implement a program to find LCM of two numbers? 

import java.util.*;

class Demo {
    static int com = 1;

    static int lcm(int n1, int n2) {
        if (com % n1 == 0 && com % n2 == 0)
            return com;
        com++;
        lcm(n1, n2);
        return com;
    }
}

class Test22 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter n1 value:");
        int n1 = obj.nextInt();
        System.out.println("Enter n2 value:");
        int n2 = obj.nextInt();
        System.out.println(Demo.lcm(n1, n2));
    }
}