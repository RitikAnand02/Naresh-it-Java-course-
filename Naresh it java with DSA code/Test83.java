// Array Rotations:

// [1, 2, 3, 4, 5] ---> Left Rotations 

//       [2, 3, 4, 5, 1] ---> 1 
//       [3, 4, 5, 1, 2] ---> 2 
//       [4, 5, 1, 2, 3] ---> 3 
//       [5, 1, 2, 3, 4] ---> 4 
//       [1, 2, 3, 4, 5] ---> 5 

// Brute Force Approach:
// ----------- 
// Rotate all the elements by one position towards left/right direction for 'r' rotations. 

import java.util.*;

class Demo {
    static int[] rotateLeft(int a[], int r) {
        int temp, prev, i, j;
        for (i = 0; i < r; i++) {
            prev = a[0];
            for (j = a.length - 1; j >= 0; j--) {
                temp = a[j];
                a[j] = prev;
                prev = temp;
            }
        }
        return a;
    }
}

class Test83 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a[] = { 1, 2, 3, 4, 5 };
        System.out.println("Enter number of rotations(r):");
        int r = obj.nextInt();
        System.out.println("Before Rotation==>" + Arrays.toString(a));
        a = Demo.rotateLeft(a, r);
        System.out.println("After Rotation ==>" + Arrays.toString(a));
    }
}