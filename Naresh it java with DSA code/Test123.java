
// 05. Impl prg to sort all the characters in asc/desc order.   
import java.util.*;

class Test123 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        System.out.println(s);
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String ss = new String(ch);
        System.out.println(ss);
    }
}