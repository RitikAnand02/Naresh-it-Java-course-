public class Test {
	public static void main(String[] args) {
		int ch1 = '\u0000';
		System.out.println(ch1); // 0

		int ch2 = '\uffff';
		System.out.println(ch2); // 65535

		// charcter 'a' 4 digit hexadecimal representation
		char ch3 = '\u0061';
		System.out.println(ch3);

		// charcter 'A' 4 digit hexadecimal representation
		char ch4 = '\u0041';
		System.out.println(ch4);

	}
}