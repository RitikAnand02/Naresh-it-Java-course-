
// shell sorting:  
import java.util.*;

class Demo {
    static void shellSortDesc(int[] a, int n) {
        int gap, i, j, temp;
        for (gap = n / 2; gap >= 1; gap = gap / 2) {
            for (j = gap; j < n; j++) {
                for (i = j - gap; i >= 0; i = i - gap) {
                    if (a[i + gap] < a[i])
                        break;
                    else {
                        temp = a[i + gap];
                        a[i + gap] = a[i];
                        a[i] = temp;
                    }
                }
            }
        }
    }
}

class Test109 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
        }

        System.out.println("Before Sorting====> " + Arrays.toString(a));
        Demo.shellSortDesc(a, a.length);
        System.out.println("After Sorting====> " + Arrays.toString(a));
    }
}
