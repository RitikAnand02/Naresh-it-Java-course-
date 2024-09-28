//Nested if
//big among three number

import java.util.Scanner;

class Test16 {
    public static void main(String args[]) {
        // int a = 15;
        // int b = 12;
        // int c = 18;

        System.out.print("Enter a value: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Enter b value: ");

        int b = sc.nextInt();
        System.out.print("Enter c value: ");

        int c = sc.nextInt();

        int big = 0;

        if (a > b) // (Outer if condition)
        {
            if (a > c) // Nested If Block (inner if)
                big = a;
            else
                big = c;
        } else // already confirmed b is greater than a
        {
            if (b > c)
                big = b;
            else
                big = c;
        }
        System.out.println("The big number is :" + big);
        sc.close();
    }
}

// Note :- In the above program to find out the biggest number among three
// number we need to take the help of nested if condition but the code becomes
// complex, to reduce the length of the code Logical Operator came into the
// picture.