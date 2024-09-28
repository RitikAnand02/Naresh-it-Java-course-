import java.util.*;

public class Test1 {
	public static void main(String args[]) {
		System.out.println("\t\t**Main Menu**\n");
		System.out.println("\t\t**100 Police**\n");
		System.out.println("\t\t**101 Fire**\n");
		System.out.println("\t\t**102 Ambulance**\n");
		System.out.println("\t\t**139 Railway**\n");
		System.out.println("\t\t**181 Women's Helpline**\n");

		System.out.print("Enter your choice :");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		switch (choice) {
			case 100:
				System.out.println("Police Services");
				break;
			case 101:
				System.out.println("Fire Services");
				break;
			case 102:
				System.out.println("Ambulance Services");
				break;
			case 139:
				System.out.println("Railway Enquiry");
				break;
			case 181:
				System.out.println("Women's Helpline ");
				break;
			default:
				System.out.println("Your choice is wrong");
				sc.close();
		}
	}
}