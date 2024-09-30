// In java, Can we hold hetrogeneous types of data using array ?
// -------------------------------------------------------------
// Yes, by using Object array we can hold hetrogeneous type of data but we can't peform sorting operation using Arrays.sort(), It will generate 
// java.lang.ClassCastException

import java.util.Arrays;

public class Test8{

	public static void main(String[] args) {
		Object[] arr = { 12, "NIT", 34.78, 'A', false };

		// Arrays.sort(arr); [Invalid becoz data is hetro]

		for (Object x : arr) {
			System.out.println(x);
		}

	}
}
