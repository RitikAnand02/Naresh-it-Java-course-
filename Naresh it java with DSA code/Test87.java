//  by using temp array method-1 

import java.util.*;

class Demo {
    static int[] rotateLeft_TempM1(int a[], int r) {
        r = r % a.length;
        int i, j, n = a.length;
        int temp[] = new int[r];
        for (i = 0; i < r; i++)
            temp[i] = a[i];
        for (i = r; i < n; i++)
            a[i - r] = a[i];
        for (i = 0; i < r; i++)
            a[i + n - r] = temp[i];
        return a;
    }
}

class Test87 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a[] = { 1, 2, 3, 4, 5 };
        System.out.println("Enter number of rotations(r):");
        int r = obj.nextInt();
        System.out.println("Before Rotation==>" + Arrays.toString(a));
        a = Demo.rotateLeft_TempM1(a, r);
        System.out.println("After Rotation ==>" + Arrays.toString(a));
    }
}
