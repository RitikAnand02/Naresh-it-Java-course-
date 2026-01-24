// Program to print 1st smallest, 1st largest, 2nd smallest, 2nd largest and so on 

import java.util.*;

class Test49 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter array size:");
        int i, n = obj.nextInt();

        int a[] = new int[n];
        System.out.println("Enter " + n + " elements...");
        for (i = 0; i < n; i++)
            a[i] = obj.nextInt();

        Arrays.sort(a);

        int low, high;
        low = 0;
        high = n - 1;
        while (low <= high) {
            System.out.print(a[low] + " " + a[high] + " ");
            low++;
            high--;
        }
    }
}