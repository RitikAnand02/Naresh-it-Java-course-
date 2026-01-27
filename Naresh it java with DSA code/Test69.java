
// case2: update based on elemenet:  
import java.util.*;

class Demo {

    static int[] updateElement(int a[], int oldElement, int newElement) {
        int i, b[] = new int[a.length];
        for (i = 0; i < a.length; i++)
            b[i] = a[i];
        for (i = 0; i < b.length; i++) {
            if (b[i] == oldElement) {
                b[i] = newElement;
                break;
            }
        }
        return b;
    }
}

class Test69 {
    public static void main(String[] args) {
        int a[] = { 10, 11, 12, 13, 14, 15 };
        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.toString(Demo.updateElement(a, 10, 999)));

        System.out.println(Arrays.toString(Demo.updateElement(a, 90, 999)));
    }
}