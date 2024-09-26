//In Command line Argumenet we can't ask to enter the value from our end user as shown in the Program.

public class CommandLineArgumentLimitation {
	public static void main(String[] args) {
		System.out.println("Enter Your Age :");
		int age = Integer.parseInt(args[0]);

		if (age > 18) {
			System.out.println("Eligible 4 voting");
		} else {
			System.out.println("Not Eligible 4 voting");
		}

	}
}