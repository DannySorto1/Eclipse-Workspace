package com.class21;

import com.class20.AccessModifiers;

public class TestAccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiers obj = new AccessModifiers();
		obj.isPalindrome("madam");// accessing public method
		System.out.println(obj.name3);//accessing public from a different package
	}

}
