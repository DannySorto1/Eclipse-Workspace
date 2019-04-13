package com.class22;

public class Task3 {
	private Task3(int a, int b) {
		System.out.println(a + b);
	}

	Task3() {
		System.out.println("hello Friends");
	}

	public static void main(String[] args) {
		Task3 obj = new Task3(50, 45);

	}
}
