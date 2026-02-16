
//  Impl prg to validate ATM pin number.  
import java.util.*;

class Test113 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();
        System.out.println(s.matches("[0-9]{4}"));
    }
}