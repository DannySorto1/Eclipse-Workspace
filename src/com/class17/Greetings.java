package com.class17;

public class Greetings {

	public static void main(String[] args) {
		Greetings obj = new Greetings();
		obj.hello();
		//how to find Largest number
		obj.findLargest(20, 10);//calling FindLargest And Passing Value
		obj.findLargest(30, 31);
		obj.helloToInstructor("Arif");
	}

	void hello() {//method signature
		System.out.println("Hello");//method body
	}
	void helloToInstructor(String name) {
		System.out.println("Hello "+name);
	}

	void findLargest(int a, int b) {
		;
		if (a > b) {
			System.out.println("A is larger than B");
		} else {
			System.out.println("B is larger than A");
		}
	}
}
