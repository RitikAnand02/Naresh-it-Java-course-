
// 23. Impl prg to remove special characters present in the given str.  
import java.util.*;

class Test141 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        String ss = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9'))
                ss = ss + ch;
        }
        System.out.println(ss);
    }
}