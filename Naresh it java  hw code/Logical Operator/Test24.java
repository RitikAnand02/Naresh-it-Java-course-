class Welcome {
    int x = 100; // instance variable (Non-static field)

    public void access() // instance method
    {
        System.out.println(x);
    }
}

public class Test24 {
    public static void main(String[] args) {
        Welcome w = new Welcome();
        System.out.println(w.x);
        w.access();

    }

}