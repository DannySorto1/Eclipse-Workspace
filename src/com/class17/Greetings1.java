package com.class17;

public class Greetings1 {

	public static void main(String[] args) {
		Greetings1 obj = new Greetings1();
		obj.askHowAreYou("Todd");
	}

	void askHowAreYou(String name) {
		System.out.println("How are you " + name);
	}

}
