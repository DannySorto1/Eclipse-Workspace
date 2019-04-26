package com.class26;

public class ThisWithConstructor {

	public ThisWithConstructor() {
		System.out.println("I have no parameters");
	}

	ThisWithConstructor(String str) {
		System.out.println("I have one parameter " + str);
	}

	ThisWithConstructor(String str1, String str2) {
		this(str1);
		System.out.println("I have 2 String parameter " + str1 + " " + str2);
	}

	public static void main(String[] args) {
//		ThisWithConstructor obj = new ThisWithConstructor();
//		ThisWithConstructor obj1 = new ThisWithConstructor("hello");
		ThisWithConstructor obj2 = new ThisWithConstructor("Hello", "bye");

	}
}
