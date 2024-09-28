import java.util.*;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter a Character :");

		char colour = sc.next().toLowerCase().charAt(0);

		switch (colour) {
			case 'r':
				System.out.println("Red");
				break;
			case 'g':
				System.out.println("Green");
				break;
			case 'b':
				System.out.println("Blue");
				break;
			case 'w':
				System.out.println("White");
				break;
			default:
				System.out.println("No colour");
		}
		System.out.println("Completed");
		sc.close();
	}
}