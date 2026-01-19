// 10. Implement a program to convert decimal number into binary? 

import java.util.Scanner;

class Demo {
    static int convert(int n) {
        if (n == 0)
            return 0;
        else
            return (n % 2 + 10 * convert(n / 2));
    }
}

class Test19 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        System.out.println(Demo.convert(n));
    }
}