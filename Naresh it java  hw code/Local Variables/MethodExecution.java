// MethodExecution.java
// ----------------------
public class MethodExecution {
	public static void main(String[] args) {
		System.out.println("Main Method Started");
		m1();
		System.out.println("Main Method Ended");
	}

	public static void m1() {
		System.out.println("M1 Method Started");
		m2();
		System.out.println("M1 Method Ended :");
	}

	public static void m2() {
		int x = 100;
		System.out.println("I am m2 method " + x);
	}
}

// Note : The local variable x is declared inside the method m2 so once the m2
// method execution is over x will be deleted from the Stack frame so we can't
// use x variable outside of the method i.e. outside of the Stack Frame.