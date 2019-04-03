package com.class13;

public class InterviewQuestion4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello Everybody Its Saturday night";
		System.out.println(a.substring(15));

		String[] words = a.split(" ");
		System.out.println(words.length);
		
		
		//finding out how many times a certain letter Appears  in a string 
		String Letters="yeeeeehawwww brother";
		int count = Letters.length() - Letters.replaceAll("e","").length();
		System.out.println(count);
		
	}

}
