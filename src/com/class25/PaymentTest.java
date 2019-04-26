package com.class25;

public class PaymentTest {

	public static void main(String[] args) {
		Payment obj = new Payment();
		obj.makePayment();

		MasterCard obj2 = new MasterCard();
		obj2.makePayment();

		Visa obj3 = new Visa();
		obj3.makePayment();
		obj3.annualFees();

		// achieving run time polymorphism
		// Pay-reference variable, Payment-type
		// new MasterCard();- creating object
		Payment pay = new MasterCard();
		pay.closePayment();
		pay.makePayment();

		Payment pay1 = new Visa();
		pay1.closePayment();
		pay1.makePayment();
		

	}

}
