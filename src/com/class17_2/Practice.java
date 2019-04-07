package com.class17_2;

public class Practice {
	public static void main(String[] args) {
		String str = "Sunday";
		char[] array = str.toCharArray();
		for (int i = array.length-1; i >= 0; i--) {
			System.out.print(array[i]);
		}
		
	}
}
