package com.class13;

public class StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 1 replace()-will replace old char/value with new char/value
		String str = "I am a good tester #1!";
		String newStr = str.replace('a', 'e');
		System.out.println(newStr);

		String newStr1 = str.replace("good", "great");
		System.out.println(newStr1);

		String newStr2 = str.replace("tester", "programmer");
		System.out.println(newStr2);

		String newStr3 = str.replace("Tester", "programmer");
		System.out.println(newStr3);

		str = str.replace("!", "?");
		System.out.println(str);

		str = str.replace("1", "2");
		System.out.println(str);

		// 2
		String str1 = "12Hello 3234 World 465%^%";
		String replacednum = str1.replaceAll("[0-9]", "");
		System.out.println(replacednum);

		String NewString = replacednum.replaceAll("[^A-Z a-z]", "");
		System.out.println(NewString);

//		String replacedChar=replacednum.replaceAll("[A-Za-z]", " ");
//		System.out.println(replacedChar);

		String str2 = "Hello123";
		System.out.println(str2.replaceAll("[^0-9]", ""));
		
		
	}

}
