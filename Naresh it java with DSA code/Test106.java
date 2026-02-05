
// merge sort: divide and combine  

import java.util.*;

class Demo {
    static void mergeSort(int[] a, int n) {
        if (n < 2) // base condition
            return;
        int mid = n / 2;
        int l[] = new int[mid];
        int r[] = new int[n - mid];
        int i;
        for (i = 0; i < mid; i++)
            l[i] = a[i];
        for (i = mid; i < n; i++)
            r[i - mid] = a[i];
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        merge(a, l, r, mid, n - mid);
    }

    static void merge(int a[], int l[], int r[], int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j])
                a[k++] = l[i++];
            else
                a[k++] = r[j++];
        }
        while (i < left)
            a[k++] = l[i++];
        while (j < right)
            a[k++] = r[j++];
    }
}

class Test106 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
        }

        System.out.println("Before Sorting====> " + Arrays.toString(a));
        Demo.mergeSort(a, a.length);
        System.out.println("After Sorting====> " + Arrays.toString(a));
    }
}