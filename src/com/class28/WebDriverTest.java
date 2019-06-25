package com.class28;

public class WebDriverTest {

	public static void main(String[] args) {
		WebDriver obj = new ChromeDriver();
		obj.openBrowser();
		obj.closeBrowser();
		obj.maximizeWindow();
		obj.findElement();
		
		
		System.out.println("------------------------------------");

		WebDriver obj2 = new FireFoxDriver();
		obj2.openBrowser();
		obj2.closeBrowser();
		obj2.maximizeWindow();
		obj2.findElement();

	}

}
