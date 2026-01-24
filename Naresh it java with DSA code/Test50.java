//  Print all elements in an array in wave form 

// n=5 
// 1 4 2 5 3 

// 1 2 3 4 5 

// output: 1 5 2 3 4 4 

// n=6 
// 1 4 6 2 5 3 

// 1 2 3 4 5 6  

// output: 1 6 2 5 3 4

import java.util.*;

class Test50 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter array size:");
        int t, i, n = obj.nextInt();

        int a[] = new int[n];
        System.out.println("Enter " + n + " elements...");
        for (i = 0; i < n; i++)
            a[i] = obj.nextInt();

        Arrays.sort(a);

        System.out.print(a[0] + " ");
        for (i = 1; i < n - 1; i = i + 2) {
            t = a[i];
            a[i] = a[i + 1];
            a[i + 1] = t;
            System.out.print(a[i] + " " + a[i + 1] + " ");
        }
        if (n % 2 == 0)
            System.out.print(a[i]);
    }
}