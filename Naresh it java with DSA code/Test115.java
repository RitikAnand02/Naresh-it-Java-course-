
// 27. Impl prg to validate gmail id  
// [a-z][a-z0-9_][a-z0-9_]+@gmail[.]com 
import java.util.*;

class Test115 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        System.out.println(s.matches("[a-z][a-z0-9_][a-z0-9_]+@gmail[.]com"));
    }
}