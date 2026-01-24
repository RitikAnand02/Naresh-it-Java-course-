// Implement a program to search for an element in an array 

import java.util.*;

class Test51 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter array size:");
        int i, n = obj.nextInt();

        int a[] = new int[n];
        System.out.println("Enter " + n + " elements...");
        for (i = 0; i < n; i++)
            a[i] = obj.nextInt();

        System.out.println("Enter the element to search:");
        int key = obj.nextInt();

        int index = -1;

        for (i = 0; i < n; i++) {
            if (key == a[i]) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("No such element are exits... ");
        } else
            System.out.println(a[index]);
    }
}