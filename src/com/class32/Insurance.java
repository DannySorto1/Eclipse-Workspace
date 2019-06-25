package com.class32;

public abstract class Insurance {
	public String insuranceName;

	public Insurance(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public abstract void getQuote();

	public abstract void cancelInsurance();

}

class Car extends Insurance {

	public Car(String insuranceName) {
		super(insuranceName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getQuote() {
		System.out.println(insuranceName + " 300 a month");

	}

	@Override
	public void cancelInsurance() {
		System.out.println(insuranceName+" To cancel $195 fee");

	}

}

class Pet extends Insurance {

	public Pet(String insuranceName) {
		super(insuranceName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getQuote() {
		System.out.println(insuranceName + " 50 a month");

	}

	@Override
	public void cancelInsurance() {
		System.out.println(insuranceName+" To cancel $150 fee");

	}

}

class Health extends Insurance {

	public Health(String insuranceName) {
		super(insuranceName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getQuote() {
		System.out.println(insuranceName + " $600 a month");

	}

	@Override
	public void cancelInsurance() {
		System.out.println(insuranceName+" To cancel $500 fee");

	}

}
