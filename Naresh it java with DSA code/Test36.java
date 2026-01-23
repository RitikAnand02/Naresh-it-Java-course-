
// to find max and min element present in an array 
import java.util.Scanner;

class Test36 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter array size:");
        int size = obj.nextInt();

        int max, min, i, a[] = new int[size];

        System.out.println("Enter " + size + " elements...");
        for (i = 0; i < a.length; i++) {
            a[i] = obj.nextInt();
        }

        max = a[0];
        for (i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("max=" + max);

        min = a[0];
        for (i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("min=" + min);
    }
}