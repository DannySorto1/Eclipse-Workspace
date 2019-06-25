package com.class34;

public interface Myinterface {
	int a = 100;
	final int b = 200;
	static int c = 300;
}

class Hello implements Myinterface {
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
