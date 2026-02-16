
// 01. Impl prg to read str and print char and corresponding index value.  
import java.util.*;

class Test119 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            System.out.println("index= " + i + " and char= " + s.charAt(i));
        }
    }
}
