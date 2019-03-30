package com.class5;

public class LogicalOperators {

	public static void main(String[] args) {
		
		int num=15;
		//true And False--> false
		if(num>=1 && num<=10) {
			System.out.println("number is small");
		//true and true--> true
		}else if(num>=11 && num<=100) {
			System.out.println("number is medium");
		//false and true-->false
		}else if(num>=101 && num<=1000) {
			System.out.println("number is large");
		}else {
			System.out.println("Number is not in our range");
		}
		
		
		
		
		
		
		
	}

}
