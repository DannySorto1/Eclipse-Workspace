package com.class20;

public class Task2 {

	void reverseString(String s) {
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse += s.charAt(i);

		}

		System.out.println(reverse);
	}

	boolean palidrome(String word) {
		String reverse = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse += word.charAt(i);
		}
		if (word.equalsIgnoreCase(reverse)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task2 obj = new Task2();
		obj.reverseString("Sunday");
		System.out.println(obj.palidrome("MOM"));
	}

}
