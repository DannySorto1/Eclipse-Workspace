package com.class1;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
	public static void main(String[] args) {

		String yep = "Hello Loser";
		String reverse = "";

		for (int i = yep.length() - 1; i >= 0; i--) {
			reverse = reverse + yep.charAt(i);
		}
		System.out.println(reverse);

		
		String yep1="hello Again";
		
		StringBuffer sb = new StringBuffer(yep1);
		System.out.println(sb.reverse());
		
	}
}
