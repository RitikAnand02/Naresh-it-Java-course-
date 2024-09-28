class Welcome {
    static int x = 100;

    public static void access() {
        System.out.println(x);
    }
}

public class Test23 {
    public static void main(String[] args) {
        System.out.println(Welcome.x);
        Welcome.access();
    }

}