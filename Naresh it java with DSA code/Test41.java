// Program to replace given location with new element 

import java.util.Scanner;

class Test41 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter array size:");
        int size = obj.nextInt();

        int i, a[] = new int[size];

        System.out.println("Enter " + size + " elements...");
        for (i = 0; i < a.length; i++) {
            a[i] = obj.nextInt();
        }

        System.out.println("Array Elements Before update...");
        for (i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();

        // logic
        int index, newe;
        System.out.println("Enter index value:");
        index = obj.nextInt();
        if (index >= 0 && index < a.length) {
            System.out.println("Enter new element");
            newe = obj.nextInt();
            a[index] = newe;
        } else {
            System.out.println("ArrayIndexOutOfBoundsException");
        }

        System.out.println("Array Elements After update...");
        for (i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}