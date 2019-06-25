package com.class20;

public class EasiestWayToReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "responses";
		StringBuilder builder = new StringBuilder(s);
		System.out.println(builder.reverse());
		
		String X = "Hello";
		String reverse = "";
		for (int i = X.length()-1; i >= 0; i--) {
			reverse = reverse += X.charAt(i);

		}
		System.out.println(reverse);

	}

}
