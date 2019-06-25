package interviewQuestions;

public class MinAndMax {

	public static void main(String[] args) {
		int[] numArray = { 12, 23, 45, 67, 89, 26 };

		int smallest = 0;
		int biggest = 0;

		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] > biggest) {
				biggest = numArray[i];
			} else {
				smallest = numArray[i];

			}

		}
		System.out.println(biggest);
		System.out.println(smallest);

		int[] numArray2 = { 12, 23, 45, 67, 48, 90 };

		int min = numArray2[0];
		int max = numArray2[numArray2.length - 1];
		System.out.println("Min is " + min + " Max is " + max);
	}

}
