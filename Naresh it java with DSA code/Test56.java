
// Binary Search Version5 
// I want to search for element in the between low and high values i.e. low 
// to high. 

// low -----> inclusive 
// high ----> exclusive 

import java.util.*;

class Demo {
    static int binarysearch(int a[], int l, int h, int key) {
        if (l <= h) {
            int mid = (l + h) / 2;
            if (a[mid] == key)
                return mid;
            else if (a[mid] < key)
                return binarysearch(a, mid + 1, h, key);
            else
                return binarysearch(a, l, mid - 1, key);
        }
        return -1;
    }
}

class Test56 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = obj.nextInt();

        int i, a[] = new int[n];

        System.out.println("Enter " + n + " values:");
        for (i = 0; i < n; i++)
            a[i] = obj.nextInt();

        Arrays.sort(a);

        System.out.println("Array Elements after sorting...");
        for (i = 0; i < n; i++)
            System.out.println(i + "===>" + a[i]);

        System.out.println("Enter the value to search:");
        int key = obj.nextInt();

        System.out.println("Enter starting location:");
        int start = obj.nextInt();

        System.out.println("Enter ending location");
        int end = obj.nextInt();

        System.out.println(Demo.binarysearch(a, start, end, key));
    }
}