package com.class16;

public class DogClass {
	String breed, name, color;

	public static void main(String[] args) {

		DogClass dog1 = new DogClass();
		dog1.breed = "Husky";
		dog1.color = "Black";
		dog1.name = "cody";
		dog1.bark();
		dog1.run();
		dog1.play();

		DogClass dog2 = new DogClass();
		dog2.breed = "Bulldog";
		dog2.color = "White";
		dog2.name = "Rocky";
		dog2.bark();
		dog2.run();
		dog2.play();

		DogClass dog3 = new DogClass();
		dog3.breed = "Labrador";
		dog3.color = "Brown";
		dog3.name = "Rocko";
		dog3.bark();
		dog3.run();
		dog3.play();

	}

	void bark() {
		System.out.println(breed + " can bark");
	}

	void run() {
		System.out.println(breed + " can run");

	}

	void play() {
		System.out.println(breed + " can play");
	}
}
