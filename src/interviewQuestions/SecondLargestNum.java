package interviewQuestions;

import java.util.Arrays;

public class SecondLargestNum {

	public static void main(String[] args) {
		int[] numArray = { 12, 13, 23, 45, 29 };
		Arrays.sort(numArray);
		System.out.println(numArray[numArray.length - 2]);
	}

}
