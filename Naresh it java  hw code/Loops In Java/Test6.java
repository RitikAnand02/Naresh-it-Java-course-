// How to sort an integer array :
// ------------------------------

import java.util.Arrays;

public class Test6 {
	public static void main(String[] args) {
		int arr[] = { 40, 50, 30, 90, 10, 20 };

		Arrays.sort(arr);

		for (int x : arr) {
			System.out.println(x);
		}

	}

}