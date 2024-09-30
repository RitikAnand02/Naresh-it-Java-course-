// How to sort String array :
// ----------------------------

import java.util.Arrays;

public class Test7{
	public static void main(String[] args) {
		String fruits[] = { "Orange", "Mango", "Apple" };

		Arrays.sort(fruits);

		for (String fruit : fruits) {
			System.out.println(fruit);
		}

	}

}