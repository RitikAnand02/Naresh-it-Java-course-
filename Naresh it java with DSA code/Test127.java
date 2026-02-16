
// 09. Impl prg to divide the strings seperated by spaces/comma/-.  
import java.util.*;

class Test127 {
    public static void main(String[] args) {
        String s = "the quick brown fox jumps over lazy dog";
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens())
            System.out.println(st.nextToken());
    }
}