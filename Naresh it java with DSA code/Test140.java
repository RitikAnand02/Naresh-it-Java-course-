
// 22. Impl prg to convert lower case chars to upper case and vice versa (swapcase).  
import java.util.*;

class Test140 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        String ss = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z')
                ss = ss + (char) (ch - 32);
            if (ch >= 'A' && ch <= 'Z')
                ss = ss + (char) (ch + 32);
        }
        System.out.println(ss);
    }
}
