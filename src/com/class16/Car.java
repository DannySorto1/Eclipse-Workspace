package com.class16;

public class Car {
	String make, model, color;
	int door, wheels;

	public static void main(String[] args) {

		// ClassName variable=new ClassName();
		// 1 object
		Car car1 = new Car();
		car1.make = "Honda";
		car1.model = "Civic";
		car1.color = "Black";
		car1.door = 4;
		car1.wheels = 4;
		System.out.println("Car " + car1.make + " Has " + car1.wheels + " Wheels");
		// define Behaviour
		car1.drive();
		car1.brake();
		car1.reverse();

		Car car2 = new Car();
		car2.make = "Jeep";
		car2.model = "Wrangler";
		car2.color = "White";
		car2.door = 2;
		car2.wheels = 4;
		System.out.println("My car is a " + car2.color + " " + car2.model);
		car2.drive();
		car2.brake();
		car2.reverse();

	}

	void brake() {
		System.out.println("Car can Brake");
	}

	void drive() {
		System.out.println("Car can Drive");
	}

	void reverse() {
		System.out.println("Can can Reverse");
	}
}
