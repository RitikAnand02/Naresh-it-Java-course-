class Integer {
	public static int doSum(int x, int y) {
		return (x + y);
	}

	public static int getSquareOfTheNumber(int num) {
		return (num * num);
	}

}

public class Calculation {
	public static void main(String[] args) {
		int result = Integer.doSum(10, 20);
		System.out.println("Sum is :" + result);

		result = Integer.getSquareOfTheNumber(5);
		System.out.println("Square is :" + result);
	}
}
