package com.Tasks;

public class MortgaegRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double mortgageRate = 4.3;
		int mortgagePrice = 300000;

		if (mortgageRate > 4.5) {
			System.out.println("I am not buying the House");
		} else {
			System.out.println("I Will Consider Buying The House");
		}
		if (mortgagePrice > 200000) {
			System.out.println("I Will Take A Loan");
		} else {
			System.out.println("I Will Pay Cash");
		}

	}

}
