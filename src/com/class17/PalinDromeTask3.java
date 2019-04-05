package com.class17;

public class PalinDromeTask3 {

	public static void main(String[] args) {
		PalinDromeTask3 obj = new PalinDromeTask3();
		obj.palindromeOrNot("Dad");
	}

	void palindromeOrNot(String name) {
		String reverse ="";
		for (int i = name.length() - 1; i >= 0; i--) {
			reverse += name.charAt(i);
		}
		if (name.equalsIgnoreCase(reverse)) {
			System.out.println("The word is palidrome");
		} else {
			System.out.println("word is not a palidrome");
		}
	}
}
