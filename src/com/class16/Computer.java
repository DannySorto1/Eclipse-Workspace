package com.class16;

public class Computer {
	String os,brand;
	boolean mouse, keyboard;
	int ram, screen;

	public static void main(String[] args) {

		Computer Cpu1 = new Computer();
		Cpu1.mouse = true;
		Cpu1.keyboard = true;
		Cpu1.screen = 2;
		Cpu1.ram = 8;
		Cpu1.os = "Windows";
		Cpu1.brand="HP";
		
		Cpu1.watchMovies();
		Cpu1.listenMusic();
		Cpu1.playGames();

		Computer Cpu2 = new Computer();
		Cpu2.mouse = true;
		Cpu2.keyboard = true;
		Cpu2.screen = 2;
		Cpu2.ram = 6;
		Cpu2.os = "Mac os";
		Cpu2.brand="Apple";
		
		Cpu2.watchMovies();
		Cpu2.listenMusic();
		Cpu2.playGames();

	}

	void watchMovies() {
		System.out.println("We can Watch Movies on the Computer "+brand);
	}

	void listenMusic() {
		System.out.println("We can Listen to Music on the Computer "+brand);
	}

	void playGames() {
		System.out.println("We can play Games on the Computer "+brand);
	}
}
