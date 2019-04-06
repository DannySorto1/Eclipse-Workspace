package com.class17_2;

public class Demo2 {
	public static void main(String[] args) {
		Demo2 obj = new Demo2();
		obj.Number();
	}

	void Number() {
		for (int i = 1; i <= 5; i++) {

			for (int y = 1; y <= 9; y++) {
				System.out.print(y);
			}
			System.out.println();
		}
	}

}
