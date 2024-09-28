
//Program to check a number is 0 or +ve or -ve
import java.util.Scanner;

class Test14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a Number :");

        int num = sc.nextInt();
        if (num == 0)
            System.out.println("It is zero");

        else if (num > 0)
            System.out.println(num + " is positive");
        else
            System.out.println(num + " is negative");

        sc.close(); // To close Scanner resource
    }
}