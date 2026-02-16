
// 08. Impl prg to check whether the given str is pangram or not.  
// all english alphabets should be there in that string 

// s = "abcdefghijklmnopqrstuvwxyz"  true 
// s = "abcdefghijkmnopqrstuvwxyz"   false 
// s = "the quick brown fox jumps over lazy dog" true 

class Test126 {
    public static void main(String[] args) {
        String s = "the quick brown fox jumps over lazy dog";
        boolean flag = true;
        for (int i = 'a'; i <= 'z'; i++) {
            if (s.indexOf(i) < 0) {
                flag = false;
                break;
            }
        }
        System.out.println(flag);// true
    }
}
