// Quick Sort:- 

import java.util.*;

class Demo {
    static void quickSortAsc(int a[], int lIndex, int hIndex) {
        if (lIndex >= hIndex) // terminate recursion or base condition
            return;
        int pivot, lp, rp, temp;

        pivot = a[hIndex];
        lp = lIndex;
        rp = hIndex;

        while (lp < rp) {
            while (a[lp] <= pivot && lp < rp)
                lp++;
            while (a[rp] >= pivot && lp < rp)
                rp--;
            temp = a[lp];
            a[lp] = a[rp];
            a[rp] = temp;
        }

        temp = a[lp];
        a[lp] = a[hIndex];
        a[hIndex] = temp;

        quickSortAsc(a, lIndex, lp - 1);
        quickSortAsc(a, lp + 1, hIndex);
    }
}

class Test104 {
    public static void main(String[] args) {
        Random r = new Random();
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++)
            a[i] = r.nextInt(100);
        System.out.println("before sorting=====>" + Arrays.toString(a));
        Demo.quickSortAsc(a, 0, a.length - 1);
        System.out.println("after sorting asc=>" + Arrays.toString(a));
    }
}