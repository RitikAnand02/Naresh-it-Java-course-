
// Binary Search Version6 ---------------------- 
// Arrays.sort(a) 
// Arrays.binarySearch(arrayname,start,end,key) 

// it will search for the given key inbetween start to end-1 in an array a.
import java.util.*;

class Test57 {
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

        System.out.println(Arrays.binarySearch(a, 0, a.length, key));
    }
}