
// 07. Implement a program to find sum of digits present in the given 
// number?
import java.util.*;

class Demo {
    static int sumofdigits(int n) {
        if (n == 0)
            return 0;
        else
            return (n % 10) + sumofdigits(n / 10);
    }
}

class Test16 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter n value:");
        int n = obj.nextInt();
        System.out.println(Demo.sumofdigits(n));
    }
}