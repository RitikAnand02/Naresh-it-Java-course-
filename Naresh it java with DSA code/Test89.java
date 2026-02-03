
//  by using temp array method-2 
import java.util.*;

class Demo {
    static int[] rotateLeft_TempM2(int a[], int r) {
        r = r % a.length;
        int i, n = a.length;
        int temp[] = new int[n];
        for (i = 0; i < n; i++)
            temp[i] = a[(i + r) % n];
        for (i = 0; i < n; i++)
            a[i] = temp[i];
        return a;
    }
}

class Test89 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a[] = { 1, 2, 3, 4, 5 };
        System.out.println("Enter number of rotations(r):");
        int r = obj.nextInt();
        System.out.println("Before Rotation==>" + Arrays.toString(a));
        a = Demo.rotateLeft_TempM2(a, r);
        System.out.println("After Rotation ==>" + Arrays.toString(a));
    }
}