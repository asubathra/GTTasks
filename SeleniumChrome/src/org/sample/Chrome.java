package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\SubathraSpace\\eclipse-workspace\\SeleniumTask\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");

		String title = driver.getTitle();
		System.out.println("current Title:" +title);
		
		driver.close();
		
	}
	}



