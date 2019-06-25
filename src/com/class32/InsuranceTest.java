package com.class32;

import java.util.ArrayList;

public class InsuranceTest {

	public static void main(String[] args) {
		Car car = new Car("StateFarm");
		Pet pet = new Pet("AniCare");
		Health M = new Health("MediCare");

		ArrayList<Insurance> alist = new ArrayList<>();
		alist.add(car);
		alist.add(pet);
		alist.add(M);

		for (Insurance Ini : alist) {
			System.out.println(Ini.insuranceName);
			Ini.getQuote();
			Ini.cancelInsurance();
			System.out.println("-------------");

		}
	}
}
