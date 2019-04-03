package com.class13;

public class InClassTasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Whats Up Family";
		String NoSpace = str.replaceAll("[^A-Za-z]", "");
		System.out.println(NoSpace);

		String str2 = "123danny&^&";
		String NoNum = str2.replaceAll("[^a-z]", "");
		System.out.println(NoNum.length());

		String a = "Is it saturday class? Is it raining? Do we Have Java Class todAY?";
		String[] sentence = a.split("[?]");
		System.out.println(sentence.length);

	}
}