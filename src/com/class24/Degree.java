package com.class24;

public class Degree {
	public void getDegree() {
		System.out.println("I got a degree Class");
	}
}

class Undergraduate extends Degree{
	public void getDegree() {
		System.out.println("I am Undergraduate");
	}
}

class Postgraduate extends Degree{
	public void getDegree() {
		System.out.println("I am Postgraduate");
	}
}