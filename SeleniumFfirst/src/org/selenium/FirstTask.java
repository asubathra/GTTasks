package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTask {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\SubathraSpace\\eclipse-workspace\\SeleniumFfirst\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.gmail.com/");

	String title =driver.getTitle();
	System.out.println("The Current Title:" +title);
	
	driver.close();
}
}
