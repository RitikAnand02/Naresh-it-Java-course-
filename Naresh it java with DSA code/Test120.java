
// 02. Impl prg to read str and print chars present at even/odd index values.  
import java.util.*;

class Test120 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0)// i%2!=0
                System.out.println("index= " + i + " and char= " + s.charAt(i));
        }
    }
}
