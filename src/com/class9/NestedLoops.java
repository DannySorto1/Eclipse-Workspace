package com.class9;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
////		for (int i = 0; i < 5; i++) {
////
////			for(int y=1; y<10; y++) {
////				System.out.print(y);
////			}
////			System.out.println();
////		}
////
////		for (int a = 0; a < 4; a++) {
////
////			for (int b = 0; b < 5; b++) {
////				System.out.print("*");
////
////			}
////			System.out.println();
//
////			for(int a=4; a>=1; a--) {
////				
////				for(int b=5; b>=1; b--) {
////					System.out.print(b);
////				}
////				System.out.println();
////			}

		for (int i = 0; i < 4; i++) {

			for (int a = 0; a <= i; a++) {

				System.out.print("*");
			}
			System.out.println();
		}

	}

}

//}
