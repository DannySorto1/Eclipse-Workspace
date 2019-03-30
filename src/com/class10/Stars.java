package com.class10;

public class Stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int a = 1; a <= 5; a++) {

			for (int b = 1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int a=1; a<=4; a++) {
			
			for(int y=4; y>=a; y--) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}
}
