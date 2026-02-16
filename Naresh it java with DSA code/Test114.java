
//  Impl prg to validate mobile number  
import java.util.*;

class Test114 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        System.out.println(s.matches("[6-9][0-9]{9}"));
    }
}