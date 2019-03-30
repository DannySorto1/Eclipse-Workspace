package com.Tasks;

public class NestedIf {
	// write a program to check work eligibility
			//if user is younger than<16--> not allowed to work
			//otherwise --> allow to work. if user is younger than 64 --> 
			//go to work otherwise---> enjoy your life
	public static void main(String[] args) {
		int age=67;
		int eligibleAge=16;
		int retirementAge=64;
		
		if (age<eligibleAge) {
			System.out.println("You are too young, No work for you pal");
		}else {
			System.out.println("You're eligible to work buddy");
		}if (age<retirementAge) {
			System.out.println("Go work hard");
		}else {
			System.out.println("But Enjoy life,You don't Need to Work Old Man");
		}
		
		

		
		
		
	}

}
