package com.class26;

public class Bank {
	public int getBalance() {
		return 0;
	}

	public static void main(String[] args) {
		BankA obj = new BankA();
		System.out.println(obj.getBalance());

		BankB obj1 = new BankB();
		System.out.println(obj1.getBalance());

		BankC obj2 = new BankC();
		System.out.println(obj2.getBalance());
	}
}

class BankA extends Bank {
	public int getBalance() {
		return 1000;
		

	}
}

class BankB extends Bank {
	public int getBalance() {
		return 1500;
	}
}

class BankC extends Bank {
	public int getBalance() {
		return 2000;
	}
}