
// 03. Implement a program to calculate a^b (a to the power b) 
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
import java.util.*;

class Demo {
    static int power(int a, int b) {
        if (b >= 1) {
            return a * power(a, b - 1);
        } else
            return 1;
    }
}

class Test12 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        System.out.println(Demo.power(a, b));
    }
}