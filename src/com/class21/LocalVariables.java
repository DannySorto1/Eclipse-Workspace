package com.class21;

public class LocalVariables {

	public static void main(String[] args) {

		String name = "john";
//		System.out.println(name);

		LocalVariables obj = new LocalVariables();
		obj.hello("John");
		System.out.println(name);
	}

	public void hello(String name) {
		name = "jack";
		System.out.println("hello " + name);
	}
}