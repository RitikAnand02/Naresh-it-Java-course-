//  Linear Search of all Occurence using Array List
import java.util.*;

class Demo {
    static ArrayList linearSearch(int a[], int key) {
        int i;
        ArrayList list = new ArrayList();
        for (i = 0; i < a.length; i++) {
            if (key == a[i])
                list.add(i);
        }
        return list;
    }
}

class Test111 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[] a = { 10, 11, 12, 13, 11, 12, 11, 8, 19, 11 };
        System.out.println("Array=" + Arrays.toString(a));
        System.out.println("Enter key element to search:");
        int key = obj.nextInt();

        System.out.println(Demo.linearSearch(a, key));
    }
}