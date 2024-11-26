package com.mcq;

import java.util.function.Consumer;

public class Java84 {
	public static void main(String[] args) {
		Consumer<String> value = (a) -> System.out.println(a.toLowerCase());
		value.accept("NareshIT");
	}
}
