package com.Tasks;

import java.util.Scanner;

public class LoanSpecialist {
	public static void main(String[] args) {
		int loan;
		Scanner scan = new Scanner(System.in);
		System.out.println("What is The amount Of the Loan");
		
		loan=scan.nextInt();
		if(loan<200000) {
			System.out.println("You have been Approved");
		}else {
			System.out.println("At this moment we can't Approved this loan amount");
		}
		
		
		
		

	}

}
