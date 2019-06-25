package com.class1;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String yep = "hello son";

		StringBuffer sb = new StringBuffer(yep);
		System.out.println(sb.reverse());

		String reverse = "";
		for (int i = yep.length() - 1; i >= 0; i--) {
			reverse = reverse + yep.charAt(i);
		}
		System.out.println(reverse);
	}

}
