package com.class1;

import com.class21.InstanceVariables;

public class PracticePage {
	 void PrintTwice(String s){
		System.out.println(s);
	 }

	public static void main(String[] args) {
		PracticePage obj=new PracticePage();
		InstanceVariables obj3 = new InstanceVariables();
		System.out.println(obj3.name);
		obj.PrintTwice("Don't make me say this twice!");
	}
}
