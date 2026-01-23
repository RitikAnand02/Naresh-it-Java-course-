
import java.util.*;

class Test48 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter any string:");
        String s = obj.nextLine();

        char t, a[] = s.toCharArray();
        // Arrays.sort(ch);
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }

        System.out.println(new String(a));
    }
}
