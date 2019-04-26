package com.ReviewClass7;

public class Parent {
	int a;
	int b;
	int c;

	Parent() {
		System.out.println("This is a Constructor");
	}

	Parent(int a, int b, int c) {
System.out.println(a+" "+b+" "+c);
;
	}

	public static void main(String[] args) {
		Parent obj = new Parent();
		Parent obj1 = new Parent(10, 23, 45);
	}
}
