package com.class36;

public class task1 {
	public static void balance(int CB, int WA) {
		if (CB >= WA) {
			System.out.println("Please take your money");
		} else {
			throw new NullPointerException("The amount entered is out of your withdraw, please enter other amount");
		}
	}

	public static void main(String[] args) {
		balance(2000, 4000);
	}
}
