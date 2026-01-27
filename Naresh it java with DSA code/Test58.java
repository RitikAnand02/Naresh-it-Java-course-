
// Arrays.toString(array) 
// It will read elements one-by-one from an array and it converts into the 
// following string format. 

// "["+e1+", "+e2+", "+e3+", "+...+"+en"]" ---> toString() 

// 11,12,13,14 ----> [11, 12, 13, 14] 
import java.util.*;

class Test58 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = obj.nextInt();

        int i, a[] = new int[n];

        System.out.println("Enter " + n + " values:");
        for (i = 0; i < n; i++)
            a[i] = obj.nextInt();

        System.out.println("Array Elements one-by-one...");
        for (i = 0; i < n; i++)
            System.out.println(i + "===>" + a[i]);

        System.out.println(Arrays.toString(a));
    }
}