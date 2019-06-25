package com.class32;

import java.util.ArrayList;

public class CreditCardTest {

	public static void main(String[] args) {
		Visa visa = new Visa("Visa Platinum");
//		System.out.println(visa.creditCardName);
//		visa.annualFee();
//		visa.interestRate();
//		visa.openAccount();
//
		AE ae = new AE("American Express");
//		System.out.println(ae.creditCardName);
//		ae.annualFee();
//		ae.interestRate();
//		ae.openAccount();
//
		MasterCard Mc = new MasterCard("Master Card BlackCard");
//		System.out.println(Mc.creditCardName);
//		Mc.annualFee();
//		Mc.interestRate();
//		Mc.openAccount();

		ArrayList<CreditCard> alist = new ArrayList<>();
		alist.add(visa);
		alist.add(ae);
		alist.add(Mc);
		
		for(CreditCard card:alist) {
			System.out.println(card.creditCardName);
			card.interestRate();
			card.annualFee();
			card.openAccount();
			System.out.println("---------");
		}
		

	}

}
