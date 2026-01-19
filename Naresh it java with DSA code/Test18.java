// 09. Implement a program to count number of digits present in the given 
// number 

import java.util.Scanner;

class Demo {
    static int c = 0;

    static int count(int n) {
        if (n != 0) {
            c++;
            count(n / 10);
        }
        return (c != 0) ? c : 1;
    }
}

class Test18 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        System.out.println(Demo.count(n));
    }
}