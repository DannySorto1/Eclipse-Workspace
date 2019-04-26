package com.class28;

public abstract class File {
	public void edit() {
		System.out.println("This file is Editable");
	}

	public void close() {
		System.out.println("This file can be Closed");
	}

	public abstract void open();

}

class JavaFile extends File {

	@Override
	public void open() {
		System.out.println("To open java you need notepad++");

	}

}

class WordFile extends File{

	@Override
	public void open() {
		System.out.println("To open Word File you need MircoSoft Word Office");
		
	}
	
}

class PDFFile extends File{

	@Override
	public void open() {
		System.out.println("To open PDFFile you need Adobe PhotoShop");
		
	}
	
}