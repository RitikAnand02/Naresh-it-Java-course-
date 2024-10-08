package com.test;

public class Mcq20 {
    public static void main(String[] argv)
    {
                int i = 6;
		long l = 7l;
		short s = 7;
		s += i += l += s;
		System.out.println(s);
		byte b = (byte) (char) (int) (i + l + s);
		System.out.println(b);
    }

}
