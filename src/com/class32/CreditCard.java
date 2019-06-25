package com.class32;

public abstract class CreditCard {
	public String creditCardName;

	public CreditCard(String creditCardName) {
		this.creditCardName = creditCardName;

	}

	public void openAccount() {
		System.out.println("Open " + creditCardName + " credit card");
	}

	public abstract void interestRate();

	public abstract void annualFee();

}

class Visa extends CreditCard {

	public Visa(String creditCardName) {
		super(creditCardName);

	}

	@Override
	public void interestRate() {
		System.out.println(creditCardName + " Card has interest rate of 25%");

	}

	@Override
	public void annualFee() {
		System.out.println(creditCardName + " Card has annual fee of $250 ");

	}

}

class AE extends CreditCard {

	public AE(String creditCardName) {
		super(creditCardName);

	}

	@Override
	public void interestRate() {
		System.out.println(creditCardName + " Card has interest rate of 25%");

	}

	@Override
	public void annualFee() {
		System.out.println(creditCardName + " Card has annual fee of $250 ");

	}

}

class MasterCard extends CreditCard {

	public MasterCard(String creditCardName) {
		super(creditCardName);

	}

	@Override
	public void interestRate() {
		System.out.println(creditCardName + " Card has interest rate of 25%");

	}

	@Override
	public void annualFee() {
		System.out.println(creditCardName + " Card has annual fee of $250 ");

	}

}