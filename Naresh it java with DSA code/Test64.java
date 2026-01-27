
// case3: inserting an element at given location 
import java.util.*;

class Demo {
    static int[] insertAtLocation(int a[], int element, int location) {
        int i, k = 0, b[] = new int[a.length + 1];
        for (i = 0; i < location; i++)
            b[k++] = a[i];
        b[k++] = element;
        for (i = location; i < a.length; i++)
            b[k++] = a[i];
        return b;
    }
}

class Test64 {
    public static void main(String[] args) {
        int a[] = { 10, 20, 30, 40, 50 };
        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.toString(Demo.insertAtLocation(a, 999, 0)));

        System.out.println(Arrays.toString(Demo.insertAtLocation(a, 999, 1)));

        System.out.println(Arrays.toString(Demo.insertAtLocation(a, 999, 2)));

        System.out.println(Arrays.toString(Demo.insertAtLocation(a, 999, 3)));

        System.out.println(Arrays.toString(Demo.insertAtLocation(a, 999, 4)));
    }
}