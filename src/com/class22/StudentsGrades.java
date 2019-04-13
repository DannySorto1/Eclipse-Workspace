package com.class22;

public class StudentsGrades {
	int mathgrade;
	int historygrade;
	int englishgrade;
	String studentname;
	String studentlastName;

	StudentsGrades(String name, String lastName) {
		studentname = name;
		studentlastName = lastName;
	}

	public void AverageGrade(int mathgrade, int historygrade, int englishgrade) {
		int average;
		average = (mathgrade + historygrade + englishgrade) / 3;
		System.out.println(studentname + " " + studentlastName + ":" + average);
	}

}
