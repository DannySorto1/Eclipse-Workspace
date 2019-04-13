package com.class22;

public class TestStudentGrades {

	public static void main(String[] args) {
		StudentsGrades stu1 = new StudentsGrades("Danny", "Sorto");
		stu1.AverageGrade(90, 80, 95);

		StudentsGrades stu2 = new StudentsGrades("Arif", "Teacher");
		stu2.AverageGrade(100, 85, 90);

		StudentsGrades stu3 = new StudentsGrades("Todd", "Rich");
		stu3.AverageGrade(100, 70, 75);

		StudentsGrades stu4 = new StudentsGrades("Roddy", "Rebel");
		stu4.AverageGrade(100, 70, 75);

		StudentsGrades stu5 = new StudentsGrades("Tekashi", "SiXNine");
		stu5.AverageGrade(60, 50, 45);
	}

}
