import java.util.*;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name of the season :");
		String season = sc.next().toLowerCase();

		switch (season) // String allowed from 1.7
		{
			case "summer":
				System.out.println("It is summer Season!!");
				break;

			case "rainy":
				System.out.println("It is Rainy Season!!");
				break;
		}
		sc.close();
	}
}