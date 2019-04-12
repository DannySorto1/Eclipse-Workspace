package com.class20;

public class StudentScore {
	static int whatsUp(int x, int y) {
		return x + y;
	}

	char getGrade(int score) {
		char grade = 0;

		if (score > 90) {
			grade = 'A';
		} else if (score > 80) {
			grade = 'B';
		} else if (score > 70) {
			grade = 'C';
		} else if (score > 50) {
			grade = 'D';

		} else {
			grade = 'F';
		}
		return grade;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentScore obj = new StudentScore();
		System.out.println(obj.getGrade(90));

		
	}

}
