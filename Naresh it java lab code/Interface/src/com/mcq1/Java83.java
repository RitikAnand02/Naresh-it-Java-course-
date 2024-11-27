package com.mcq1;

import java.util.function.Consumer;

public class Java83 {
	public static void main(String[] args) {
		Consumer<String> value = (a) -> System.out.println("Naresh I Technologies");
		value.accept("");
	}
}