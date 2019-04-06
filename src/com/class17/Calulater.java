package com.class17;

public class Calulater {

	public static void main(String[] args) {
		Calulater obj = new Calulater();
System.out.print(obj.sub(7, 7));
	}

	public int sub(int a, int b) {
		//System.out.println(a - b);
		return a - b;
	}

 	 public int mult(int a, int b) {
 		 System.out.println(a * b);
		return a * b;
	}

	public  int div(int a, int b) {
		System.out.println(a / b);
		return a / b;
	}

	public int sum(int a, int b) {
		System.out.println(a + b);
		return a + b;
	}
}
