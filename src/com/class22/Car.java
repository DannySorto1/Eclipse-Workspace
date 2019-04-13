package com.class22;

public class Car {
	public static String make = "Toyota";
	String color;// declaring instance variable
	String model;
	int doors;
	boolean engine;

	Car() {// CONSTRUCTOR
		System.out.println("I am a Constrcutor");

	}

	public static void main(String[] args) {
		Car obj = new Car();
		System.out.println(obj.color);
		System.out.println(obj.doors);
		System.out.println(obj.engine);
		
	}

	public static void hello() {
		String name;
		System.out.println("I am a static hello method");
	}
}
