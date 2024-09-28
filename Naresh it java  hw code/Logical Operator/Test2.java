
//Arithmetic Operator (+, -, *, / , %)
//Reverse of a 3 digit number
import java.util.*;

class Test2 {
    public static void main(String[] args) {
        System.out.print("Enter a three digit number :");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // num = 567

        int rem = num % 10; // rem = 7
        System.out.print("The Reverse is :" + rem); // The reverse is :765

        num = num / 10; // num = 56
        rem = num % 10; // rem = 6
        System.out.print(rem);

        num = num / 10; // num = 5
        System.out.println(num);
        sc.close();
    }
}