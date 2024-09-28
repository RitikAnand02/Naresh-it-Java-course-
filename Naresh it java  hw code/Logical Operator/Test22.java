public class Test22 {
    public static void main(String[] args) {
        char ch = 'A';
        float i = 12;
        System.out.println(false ? i : ch); // 65.0 //type casting
        System.out.println(true ? ch : i); // 65.0 //type casting

    }

}