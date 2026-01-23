
// version2: sort the elements in desc order 
import java.util.*;

class Test43 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter array size:");
        int i, j, t, n = obj.nextInt();

        int a[] = new int[n];
        System.out.println("Enter " + n + " elements.");
        for (i = 0; i < n; i++)
            a[i] = obj.nextInt();

        System.out.println("Array Elements Before Sorting:");
        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");

        // version2==> sort the data in desc order
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }

        System.out.println();
        System.out.println("Array Elements After Sorting:");
        for (i = 0; i < n; i++)
            System.out.print(a[i] + " ");

    }
}