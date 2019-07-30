package com.class5;

public class WorkDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a boolean variable workDay and assign true
//	    * create int variable day and assign it to 1
//	    * as long as it is workDay print--> "I need a day off" and increment day
//	    * day once day is 6 --> your condition for your loop should become false 

		boolean workDay = true;
		int day = 5;

		while (workDay) {
			System.out.println("I need a day off");
			day++;

			if (day == 6) {
				workDay = false;
			}
		}
		System.out.println("I don't need a day off");
	}

}
