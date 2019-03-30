package com.ReviewClass;

import java.util.Scanner;

public class HomeWork6Point1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean weekend;

		Scanner scan=new Scanner(System.in);
		System.out.println("is it weekend?");
		weekend=scan.nextBoolean();

		if(weekend){
		System.out.println("you are learning java today");
		}else{
		System.out.println("you are learning manual testing today");
		}
	}

}
