package com.class12;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Sunday";

		System.out.print(str.charAt(5));
		System.out.print(str.charAt(4));
		System.out.print(str.charAt(3));
		System.out.print(str.charAt(2));
		System.out.print(str.charAt(1));
		System.out.println(str.charAt(0));

		String rev = "Sunday";
		for (int i = rev.length() - 1; i >= 0; i--) {
			System.out.print(rev.charAt(i));

		}
		
		
	}
}
