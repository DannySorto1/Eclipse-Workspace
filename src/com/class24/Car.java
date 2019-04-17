package com.class24;

public class Car {
	static String make = "Unkown";
	static String model = "Unkown";
	static int numberOfDoors = 4;
	static int topSpeed = 90;
	static double price = 0.0;

	Car(String make, String model, int nummberOfDoors, int topSpeed, double price) {
		System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);
	}

	Car(String make, String model, int topSpeed, double price) {
		System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);
	}

	Car(int nummberOfDoors, int topSpeed, double price) {
		System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);
	}

	Car(String make, String model, int nummberOfDoors) {
		System.out.println(make + " " + model + " " + numberOfDoors + " " + topSpeed + " " + price);
	}

}
