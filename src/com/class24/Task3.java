package com.class24;

public class Task3 {
	private void add(int a, int b) {
		System.out.println(a + b);
	}

	private void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	private void add(double a, double b, double c, double d) {
		System.out.println(a + b + c / d);
	}

	public static void main(String[] args) {
		Task3 obj = new Task3();
		obj.add(12, 34);
		obj.add(12, 12, 34);
		obj.add(12.0, 40.0, 50.0, 3.0);
	}
}
