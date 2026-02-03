
//  by using 'temp' variable
import java.util.*;

class Demo {
    static int[] rotateRight_Temp(int a[], int r) {
        r = r % a.length;

        int temp, i, j;

        for (i = 0; i < r; i++) {
            temp = a[a.length - 1];
            for (j = a.length - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }
            a[0] = temp;
        }

        return a;
    }
}

class Test86 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int a[] = { 1, 2, 3, 4, 5 };

        System.out.println("Enter number of rotations(r):");
        int r = obj.nextInt();

        System.out.println("Before Rotation==>" + Arrays.toString(a));
        a = Demo.rotateRight_Temp(a, r);
        System.out.println("After Rotation ==>" + Arrays.toString(a));
    }
}