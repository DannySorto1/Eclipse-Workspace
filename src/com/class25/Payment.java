package com.class25;

public class Payment {
	public void makePayment() {
		System.out.println("I can make Payments");
	}
	public void closePayment() {
		System.out.println("All payments need to be closed");
	}
}

class MasterCard extends Payment {
	public void makePayment() {
		System.out.println("I can make payments with MC and have 2% fees");
	}
}


class Visa extends Payment{
	public void makePayment() {
		System.out.println("I can make payemts with Visa and have 1.5% fees");
	}

	public void annualFees() {
		System.out.println("Visa Has annaul fees");
	}
}