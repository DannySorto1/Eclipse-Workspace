package com.class28;

public interface Bank {
	void hasChecking();

	void hasSavings();

	void HasCreditCard();

}
class BOA implements Bank{

	@Override
	public void hasChecking() {
		System.out.println("BOA Has 2 checking accounts");
		
	}

	@Override
	public void hasSavings() {
		System.out.println("BOA has 2 savings account");
		
	}

	@Override
	public void HasCreditCard() {
	System.out.println("BOA has 10 different cc");
		
	}
	
}

class PNC implements Bank{

	@Override
	public void hasChecking() {
		System.out.println("PNC has 3 checking accounts");
		
	}

	@Override
	public void hasSavings() {
		System.out.println("PNC has 3 savings accounts");
		
	}

	@Override
	public void HasCreditCard() {
		System.out.println("PNC has 7 different cc");
		
	}
	
}
