
// Quick Sort:- 
import java.util.*;

class Demo {
    static void quickSortDesc(int a[], int lIndex, int hIndex) {
        if (lIndex >= hIndex) // terminate recursion or base condition
            return;
        int pivot, lp, rp, temp;

        pivot = a[hIndex];
        lp = lIndex;
        rp = hIndex;

        while (lp < rp) {
            while (a[lp] >= pivot && lp < rp)
                lp++;
            while (a[rp] <= pivot && lp < rp)
                rp--;
            temp = a[lp];
            a[lp] = a[rp];
            a[rp] = temp;
        }

        temp = a[lp];
        a[lp] = a[hIndex];
        a[hIndex] = temp;

        quickSortDesc(a, lIndex, lp - 1);
        quickSortDesc(a, lp + 1, hIndex);
    }
}

class Test105 {
    public static void main(String[] args) {
        Random r = new Random();
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++)
            a[i] = r.nextInt(100);
        System.out.println("before sorting=====>" + Arrays.toString(a));
        Demo.quickSortDesc(a, 0, a.length - 1);
        System.out.println("after sorting desc=>" + Arrays.toString(a));
    }
}