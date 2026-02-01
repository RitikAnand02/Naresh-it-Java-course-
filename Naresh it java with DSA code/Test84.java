// Array Rotations: 

//  [1, 2, 3, 4, 5] ---> Right Rotations 

//       [5, 1, 2, 3, 4] ---> 1 
//       [4, 5, 1, 2, 3] ---> 2 
//       [3, 4, 5, 1, 2] ---> 3 
//       [2, 3, 4, 5, 1] ---> 4 
//       [1, 2, 3, 4, 5] ---> 5

// Brute Force Approach:
// ----------- 
// Rotate all the elements by one position towards left/right direction for 'r' rotations.

import java.util.*;

class Demo {
    static int[] rotateRight(int a[], int r) {
        int temp, prev, i, j;
        for (i = 0; i < r; i++) {
            prev = a[a.length - 1];
            for (j = 0; j < a.length; j++) {
                temp = a[j];
                a[j] = prev;
                prev = temp;
            }
        }
        return a;
    }
}

class Test84 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a[] = { 1, 2, 3, 4, 5 };
        System.out.println("Enter number of rotations(r):");
        int r = obj.nextInt();
        System.out.println("Before Rotation==>" + Arrays.toString(a));
        a = Demo.rotateRight(a, r);
        System.out.println("After Rotation ==>" + Arrays.toString(a));
    }
}