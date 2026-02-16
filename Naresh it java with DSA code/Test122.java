
// 04. Impl prg to count numbers of vowels/consonants present in the given str.  
import java.util.*;

class Test122 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        System.out.println(s);
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                c++;
        }
        System.out.println(c);
    }
}