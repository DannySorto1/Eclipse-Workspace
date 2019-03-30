package com.class12;

public class Task4 {
	public static void main(String[] args) {

		String text = "Java is getting challenging";
		

		if (!(text.isEmpty())) {
			if (text.length() % 2 != 0 && text.length() > 3) {

				System.out.println(text.charAt(text.length() / 2));

			}

		}
	}
}
