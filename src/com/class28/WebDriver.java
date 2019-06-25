package com.class28;

public interface WebDriver {
	void openBrowser();

	void closeBrowser();

	void maximizeWindow();

	void findElement();

}

class ChromeDriver extends Browser implements WebDriver {

	@Override
	public void openBrowser() {
		System.out.println("Chrome can Open Browser");
	}

	@Override
	public void closeBrowser() {
		System.out.println("Chrome can close Browser");

	}

	@Override
	public void maximizeWindow() {
		System.out.println("Chrome can mazimize Window");

	}

	@Override
	public void findElement() {
		System.out.println("Chrome can find the element");

	}

	@Override
	public void refresh() {
		System.out.println("You can Refresh Chrome");
	}

}

class FireFoxDriver extends Browser implements WebDriver {

	@Override
	public void openBrowser() {
		System.out.println("Firefox can open browser");

	}

	@Override
	public void closeBrowser() {
		System.out.println("FireFox can close browser");
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Firefox can maximize windows");
	}

	@Override
	public void findElement() {
		System.out.println("FireFox can find the element");
	}

	@Override
	public void refresh() {
		System.out.println("You can Refresh FireFox");
	}

}
