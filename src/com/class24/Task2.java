package com.class24;

public class Task2 {
	public static void sum(int a, int b) {
		System.out.println(a + b);
	}

	public static void sum(double a, double b) {
		System.out.println(a + b);
	}

	public static void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
		Task2.sum(12, 12);
		Task2.sum(23.23, 45.23);
		Task2.sum(12, 12, 12);
	}
}
