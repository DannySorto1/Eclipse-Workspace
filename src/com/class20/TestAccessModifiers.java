package com.class20;

public class TestAccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiers obj = new AccessModifiers();
		obj.isPalindrome("madam");// accessing public method
		obj.reverseString("hello");// accessing protected method
		obj.sayHello();// accessing default method
		System.out.println(obj.name1);// accessing default variable
		System.out.println(obj.name2);// accessing protected variable
		System.out.println(obj.name3);// accessing public variable
	}

}
