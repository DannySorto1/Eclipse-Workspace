package com.class34;

public interface MyInterface1 {
	void m1();

}

interface MyInterface2 extends MyInterface1 {

	public void m2();

}

class Main implements MyInterface2 {

	@Override
	public void m1() {
		System.out.println("method1-----welcome to syntax solutions");

	}

	@Override
	public void m2() {
		System.out.println("method2-----hi syntax solutions how are you");

	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.m1();
		obj.m2();
	}

}