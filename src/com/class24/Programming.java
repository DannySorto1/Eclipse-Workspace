package com.class24;

public class Programming {
	public static String str = "programming languages";

	public static void main(String[] args) {
		Programming obj = new Programming();
		Programming obj2 = new Programming("Java");
	}

	Programming() {
		System.out.println("I love " + str);
	}

	Programming(String str) {
		System.out.println("I love " + str);
	}
}
