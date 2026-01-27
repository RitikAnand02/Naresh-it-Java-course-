
// DELETING AN ELEMENT FROM AN ARRAY 
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
// case1: deleting an element located at the given location  
import java.util.*;

class Demo {
    static int[] deleteElementAtLocation(int a[], int location) {
        int k = 0, i, b[] = new int[a.length - 1];
        for (i = 0; i < a.length; i++) {
            if (i == location)
                continue;
            b[k++] = a[i];
        }
        return b;
    }
}

class Test65 {
    public static void main(String[] args) {
        int a[] = { 10, 11, 12, 13, 14, 15 };
        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.toString(Demo.deleteElementAtLocation(a, 0)));

        System.out.println(Arrays.toString(Demo.deleteElementAtLocation(a, 1)));

        System.out.println(Arrays.toString(Demo.deleteElementAtLocation(a, 2)));

        System.out.println(Arrays.toString(Demo.deleteElementAtLocation(a, 3)));

        System.out.println(Arrays.toString(Demo.deleteElementAtLocation(a, 4)));

        System.out.println(Arrays.toString(Demo.deleteElementAtLocation(a, 5)));
    }
}