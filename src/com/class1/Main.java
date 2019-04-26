package com.class1;

public class Main {
	public static void main(String[] args) {
		Child cc = new Child();
		cc.sum(50, 60);

	}
}

class Parent {
	int a = 10;
	int b = 20;
}

class Child extends Parent {
	int a = 30;
	int b = 40;

	public void sum(int a, int b) {
		
		System.out.println(a + b);
		System.out.println(this.a + this.b);
		System.out.println(super.a + super.b);
	}
}