package com.Tasks;

import java.util.Scanner;

public class CityAndTemperture {

	public static void main(String[] args) {
		String cityName;
		int temp;
		Scanner myScanner=new Scanner(System.in);
		System.out.println("please enter your city");
		
		cityName=myScanner.nextLine();
		
		System.out.println("Please enter temperture in fahrenheit");
		
		temp=myScanner.nextInt();
		//Fomula(F-32)x5/8
		
		int convertedTemp=(temp-32)*5/9;
		System.out.println("The Temperture in the city "+cityName+" is "+convertedTemp+" celsius");
		
	}
}
